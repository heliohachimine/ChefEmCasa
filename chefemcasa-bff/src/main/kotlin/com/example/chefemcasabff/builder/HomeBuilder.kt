package com.example.chefemcasabff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.layout.SafeArea
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.layout.ScrollView
import br.com.zup.beagle.widget.ui.Text

object HomeBuilder: ScreenBuilder {
    val margin = EdgeValue(top = 10.unitReal(), left = 15.unitReal(), bottom = 10.unitReal())

    override fun build(): Screen {
        return Screen(
                safeArea = SafeArea(top = false),
                child = ScrollView(
                        children = listOf(
                            Text("Bem vindo Fulano!")
                                    .applyStyle(style = Style(margin = margin)),
                            Text("Sugestões para você")
                                    .applyStyle(style = Style(margin = margin))
                        )
                )
        )
    }


}
