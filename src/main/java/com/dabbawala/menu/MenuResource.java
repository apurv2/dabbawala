/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dabbawala.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Juergen Hoeller
 * @author Ken Krebs
 * @author Arjen Poutsma
 * @author Michael Isvy
 */
@RestController
class MenuResource {
    @Autowired
    AbstractMenuService menuService;

    @CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/menu/new")
    public Menu createNewMenuItem(@RequestBody MenuItem menuItem) {
        return menuService.save(menuItem);
    }

    @CrossOrigin
    @GetMapping(value = "/menu/{id}")
    public Menu getMenuById(@PathVariable int consumerId) {
        return menuService.getMenuItemById(consumerId);
    }

}
