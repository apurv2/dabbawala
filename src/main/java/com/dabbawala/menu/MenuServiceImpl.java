package com.dabbawala.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements AbstractMenuService {
    @Autowired
    MenuRepository menuRepository;

    public Menu save(MenuItem menuItem) {
        return menuRepository.save(menuItem);
    }

    public Menu getMenuItemById(int menuId) {
        return null;
    }
}
