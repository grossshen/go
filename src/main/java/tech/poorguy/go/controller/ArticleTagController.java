package tech.poorguy.go.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import tech.poorguy.go.common.BaseController;
import tech.poorguy.go.entity.ArticleTag;
import tech.poorguy.go.service.IArticleTagService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author poorguy
 * @since 2019-05-23
 */
@RestController
@RequestMapping("/article-tag")
public class ArticleTagController extends BaseController<ArticleTag, IArticleTagService> {

}

