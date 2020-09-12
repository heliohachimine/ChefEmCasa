package com.example.chefemcasabff.builder

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.navigation.Touchable
import br.com.zup.beagle.widget.ui.*
import com.example.chefemcasabff.constant.DARK_SIENNA
import com.example.chefemcasabff.constant.ENGLISH_RED
import com.example.chefemcasabff.constant.LOGO
import com.example.chefemcasabff.constant.NORMAL_TEXT

class LoginBuilder : ScreenBuilder {

    override fun build(): Screen {
        return Screen(child = Container(
            children = listOf(
                image,
                emailTextInput,
                passwordTextInput,
                passwordButton,
                containerButton
            )
        ).applyStyle(Style(
            flex = Flex(
                alignItems = AlignItems.CENTER,
                justifyContent = JustifyContent.CENTER,
                grow = 1.0
            )))
        )
    }

    private val image = Image(path = ImagePath.Local.justMobile(LOGO))
        .applyStyle(Style(
            size = Size(width = 250.unitReal(), height = 150.unitReal()))
        )

    private val emailTextInput = TextInput(
        value = "",
        placeholder = "Email",
        type = TextInputType.EMAIL,
        styleId = NORMAL_TEXT
    ).applyStyle(style = Style(
        size = Size(width = 85.unitPercent(), height = 7.unitPercent()),
        margin = EdgeValue(top = 50.unitReal()))
    )

    private val passwordTextInput = TextInput(
        value = "",
        placeholder = "Senha",
        type = TextInputType.PASSWORD,
        styleId = NORMAL_TEXT
    ).applyStyle(style = Style(
        size = Size(width = 85.unitPercent(), height = 7.unitPercent()),
        margin = EdgeValue(top = 20.unitReal()))
    )

    private val passwordButton = Container(
        children = listOf(
            Touchable(
                child = Text(
                    text = "Esqueci minha senha",
                    styleId = NORMAL_TEXT,
                    textColor = DARK_SIENNA
                ).applyFlex(
                    flex = Flex(alignSelf = AlignSelf.FLEX_START)
                ),
                onPress = listOf(
                    Navigate.PushView(route = Route.Remote(url = "/password"))
                )
            )
        )
    ).applyStyle(
        Style(
            margin = EdgeValue(top = 10.unitReal()),
            size = Size(width = 85.unitPercent(), height = 7.unitPercent())
        )
    )

    private val loginButton = Button(
        text = "Entrar",
        styleId = NORMAL_TEXT,
        onPress = listOf(
            Navigate.OpenNativeRoute(route = "home")
        )
    ).applyStyle(style = Style(
        size = Size(width = 180.unitReal(), height = 40.unitReal()),
        cornerRadius = CornerRadius(radius = 10.0),
        flex = Flex(alignSelf = AlignSelf.CENTER),
        backgroundColor = ENGLISH_RED)
    )

    private val signUpButton = Button(
        text = "Cadastrar",
        styleId = NORMAL_TEXT,
        onPress = listOf(
            Navigate.PushView(route = Route.Remote(url = "/register"))
        )
    ).applyStyle(style = Style(
        size = Size(width = 85.unitPercent(), height = 40.unitReal()),
        margin = EdgeValue(all = 10.unitReal()),
        cornerRadius = CornerRadius(radius = 10.0),
        flex = Flex(alignSelf = AlignSelf.CENTER),
        backgroundColor = ENGLISH_RED)
    )

    private val containerButton = Container(
        children = listOf(
            loginButton,
            signUpButton
        )
    ).applyStyle(style = Style(
        margin = EdgeValue(top = 20.unitPercent()),
        size = Size(width = 100.unitPercent(), height = 30.unitPercent()),
        flex = Flex(justifyContent = JustifyContent.SPACE_BETWEEN, grow = 1.0))
    )
}