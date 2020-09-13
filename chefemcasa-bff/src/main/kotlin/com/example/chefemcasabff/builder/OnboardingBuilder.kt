package com.example.chefemcasabff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.widget.action.SetContext
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.core.ImageContentMode
import br.com.zup.beagle.widget.core.Size
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.pager.PageIndicator
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.example.chefemcasabff.constant.BLACK
import com.example.chefemcasabff.constant.DARK_SIENNA

class OnboardingBuilder: ScreenBuilder {

    private val flexGrow = Flex(grow = 1.0)

    override fun build(): Screen {
        return Screen(
                safeArea = SafeArea(top = false, bottom = false),
                child = Container(
                        children = listOf(
                                pageView,
                                pageIndicator
                        ),
                        context = ContextData("numberPage", 0)
                ).applyFlex(flexGrow)
        )
    }

    private val page1 = Container(
            children =  listOf(
                    Image(
                            ImagePath.Remote(remoteUrl = "/images/imageFood.jpg"),
                            ImageContentMode.CENTER_CROP
                    ).applyStyle(
                            Style(
                                    size = Size(width = 100.unitPercent(), height = 100.unitPercent())
                            )
                    )

            )
    )

    private val page2 = Container(
            children =  listOf(
                    Text("ola")
            )
    )

    private val page3 =  Container(
            children =  listOf(
                    Text("ola")
            )
    )


    private val pageView = PageView(
            children = listOf(
                    page1,
                    page2,
                    page3
            ),
            onPageChange = listOf(SetContext("numberPage", "@{onPageChange}")),
            currentPage = expressionOf("@{numberPage}")
    )

    private val pageIndicator = PageIndicator(
            numberOfPages = 3,
            selectedColor = BLACK,
            unselectedColor = DARK_SIENNA,
            currentPage = expressionOf("@{numberPage}")
    )





}