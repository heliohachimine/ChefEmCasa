//
//  BeagleConfig.swift
//  chefemcasa-iOS
//
//  Created by Luis Gustavo Oliveira Silva on 12/09/20.
//  Copyright © 2020 Luis Gustavo Oliveira Silva. All rights reserved.
//

import UIKit
import Beagle
import BeagleSchema

struct BeagleConfig {

    static let dependencies = BeagleDependencies()
    static func config() {
        let baseUrl: URL? = URL(string: "http://localhost:8080")
        dependencies.urlBuilder = UrlBuilder(baseUrl: baseUrl)
        dependencies.theme = AppTheme.theme
        deeplinkManager()
        Beagle.dependencies = dependencies
    }
    
    static func deeplinkManager() {
        let deepLinkHandler = DeeplinkScreenManager.shared
        dependencies.deepLinkHandler = deepLinkHandler
    }
}
