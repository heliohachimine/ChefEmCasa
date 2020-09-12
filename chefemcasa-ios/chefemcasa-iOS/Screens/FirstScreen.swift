//
//  FirstScreen.swift
//  chefemcasa-iOS
//
//  Created by Luis Gustavo Oliveira Silva on 12/09/20.
//  Copyright © 2020 Luis Gustavo Oliveira Silva. All rights reserved.
//

import UIKit
import Beagle
import BeagleSchema

struct MainScreen {
    
    func screenController() -> UIViewController {
        let urlRelativa = "/onboarding"
        return BeagleScreenViewController(Text("texto"))
    }
}
