//
//  HomeTabBarController.swift
//  chefemcasa-iOS
//
//  Created by Gabriela Coelho on 12/09/20.
//  Copyright © 2020 Luis Gustavo Oliveira Silva. All rights reserved.
//

import UIKit
import Beagle

class HomeTabBarController: UITabBarController, DeeplinkScreen {
    required init() {
        super.init(nibName: nil, bundle: nil)
    }
    
    required init?(coder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    
    func screenController() -> UIViewController {
        return self
    }
    
    // MARK: Lifecycle
    override func viewDidLoad() {
        super.viewDidLoad()
        setup()
    }
    
    func setup() {
        let vcs = HomeTabBarController.makeTabControllers()
        viewControllers = vcs
        selectedViewController = vcs[0]
        setupTabLayout()
    }
    
    private func setupTabLayout() {
        navigationController?.setNavigationBarHidden(true, animated: true)
        tabBar.isTranslucent = false
        tabBar.tintColor = UIColor(named: .darkSienna)
        tabBar.unselectedItemTintColor = #colorLiteral(red: 0.4352941176, green: 0.4352941176, blue: 0.4352941176, alpha: 1)
        selectedIndex = 0
    }
}

extension HomeTabBarController {
    static func makeTabControllers() -> [UIViewController] {
        var controllers: [UIViewController] = []
        controllers = [
             makeHomeViewController(),
             makeSearchViewController(),
             makeProfileViewController(),
        ]
        return controllers
    }
    
    static func makeHomeViewController() -> UIViewController {
        let controller = Beagle.screen(.remote(.init(url: "/home")))
        controller.tabBarItem = UITabBarItem(
            title: "Home",
            image: UIImage(named: "home2"),
            selectedImage: nil
        )
        return controller
    }
        
    static func makeSearchViewController() -> UIViewController {
        let controller = SearchBarController()
        controller.tabBarItem = UITabBarItem(
            title: "Search",
            image: UIImage(named: "search"),
            selectedImage: nil
        )
        return controller
    }
    
    static func makeProfileViewController() -> UIViewController {
        let controller = Beagle.screen(.remote(.init(url: "/profile")))
        controller.tabBarItem = UITabBarItem(
            title: "Profile",
            image: UIImage(named: "user"),
            selectedImage: nil
        )
        return controller
    }
}
