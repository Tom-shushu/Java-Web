<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<script type="text/javascript" async="" src="./show_files/pr.js.下载"></script>
		<script type="text/javascript" async="" src="./show_files/hbfjnn.js.下载"></script>
		<script type="text/javascript" async="" src="./index_files/pr.js"></script>
		<script type="text/javascript" async="" src="./index_files/jdhlbb.js"></script>
		<title>BBS论坛首页</title>
		<link href="./show_files/Bbs_book.css" rel="stylesheet">
		<link href="./index_files/Bbs_list.css" rel="stylesheet">
		
		<script src="./index_files/Bbs_list.js" charset="gbk"></script>
		<script src="./index_files/search.js"></script>
		<script>
		    // 对象最后一个值后面不允许存在逗号
		    var _zpv_cfg = {
		        terminal: 'pc',
		        site: 'ZOL',
		        buz: 'hudong',
		        channel: 'bbs',
		        pagetype: 'list'//按需给如首页main，详情页detail
		    };
		</script>
		<script src="./index_files/zh-cn.js" type="text/javascript" defer="defer"></script><link href="./index_files/ueditor.css" type="text/css" rel="stylesheet"><script src="./index_files/jquery.easing.min.js" type="text/javascript"></script><script src="./index_files/jQueryRotate.2.2.js" type="text/javascript"></script><link type="text/css" rel="stylesheet" href="./index_files/rotate-plate.css"><link href="./index_files/zLoginDialog.css" rel="stylesheet"><link href="./index_files/zLoginDialog.css" rel="stylesheet"><script src="./index_files/view"></script><style id="edui-customize-zolinsertcode-style">.edui-default  .edui-for-zolinsertcode .edui-icon {undefined}</style><style id="edui-customize-zolblockquote-style">.edui-default  .edui-for-zolblockquote .edui-icon {undefined}</style><style id="edui-customize-zolemotion-style">.edui-default  .edui-for-zolemotion .edui-icon {undefined}</style><style id="edui-customize-atuser-style">.edui-default  .edui-for-atuser .edui-icon {undefined}</style><link id="zSearchSuggestCSS" href="./index_files/suggest20150320.css" rel="stylesheet"><script src="./index_files/codemirror.js" type="text/javascript" defer="defer"></script><link rel="stylesheet" type="text/css" href="./index_files/codemirror.css"><script type="text/javascript" src="./index_files/bbsinit_vote.php"></script>
	
		<style>
           .quick-login .ql-qq,.quick-login .ql-wechat,.quick-login .ql-sina{width:24px;height:24px;background:url(https://icon.zol-img.com.cn/service/updatepic/y_share.png) no-repeat;}
           .quick-login .ql-qq{background-position:0px -72px;}
           .quick-login .ql-wechat{background-position:0px -1px;}
           .quick-login .ql-sina{background-position:0px -38px;}
        </style>
	
	</head>
	<body>
		<!-- 公共头部 开始-->
<div class="pub-bbs-top">
	<div class="pub-bbs-top-inner clearfix">
		<ul class="pub-bbs-nav">
            <li class="pub-nav-home"><a target="_blank" href="http://www.zol.com.cn/">西安科技大学</a></li>
        	<li><a target="_blank" href="http://detail.zol.com.cn/">新卓越</a></li>
        	<li><a target="_blank" href="http://www.zol.com/">百度贴吧</a></li>
        	<li><a target="_blank" href="http://bbs.zol.com.cn/">其他</a></li>
        	<li class="pub-menu" id="pubBbs" onmouseover="__mores(&#39;pubBbs&#39;)" onmouseout="__moreh(&#39;pubBbs&#39;)">
          	<span class="ismore">更多论坛<i class="ar-ico"></i></span>
            <div class="pub-more-list" id="pubBbsDetailNotice">
            	<a target="_blank" href="http://bbs.zol.com.cn/sjbbs/">手机论坛</a>
        		<a target="_blank" href="http://bbs.zol.com.cn/dcbbs/">摄影论坛</a>
        		<a target="_blank" href="http://bbs.zol.com.cn/diybbs/" class="all">硬件论坛</a>
        		<a target="_blank" href="http://bbs.zol.com.cn/nbbbs/">笔记本论坛</a>
        		<a target="_blank" href="http://bbs.zol.com.cn/padbbs/">平板论坛</a>
        		<a target="_blank" href="http://bbs.zol.com.cn/quanzi/">兴趣圈子</a>
        		<a target="_blank" href="http://bbs.zol.com.cn/huodong/">论坛活动</a>
            </div>
         </li>
        </ul>
		<style>
           .quick-login .ql-qq,.quick-login .ql-wechat,.quick-login .ql-sina{width:24px;height:24px;background:url(https://icon.zol-img.com.cn/service/updatepic/y_share.png) no-repeat;}
           .quick-login .ql-qq{background-position:0px -72px;}
           .quick-login .ql-wechat{background-position:0px -1px;}
           .quick-login .ql-sina{background-position:0px -38px;}
        </style>
		
        <ul class="pub-bbs-login">
        	<li class="pub-user-bar">
        		<span>请 [<a target="_blank" href="#">注册</a>]</span>
        		<span>[<a target="_self" href="#">登录</a>]</span>
        		<p class="pub-login-tips" style="display:none;">登录体验更流畅的互动沟通<i></i><span class="top-close"></span></p>
        	</li>
        </ul>
	</div>
</div>
<!-- 公共头部 结束-->
<div class="ad_div ad_div_nav">
    <div><!-- _bms_{"place":"sjbbs_index_top_tonglan0", "id": "adhook1"} --></div>
</div>
	
	
	<!-- 搜索栏 开始 -->
<div class="header box-shadow">
	<div class="header-inner clearfix">
		<a href="#" class="logo">科大论坛</a>
			<div class="brand-logo"><span>西安生活</span></div>
		<div class="search-module ">
			<div class="searchbox border-radius-s3 clearfix">
				<form action="#" method="post">
				    <input type="hidden" name="c" value="search">
					<input id="searchBox" autocomplete="off" type="text" class="search-txt placeholder" name="kword" value="科技大学有哪些好玩的" />
					<input class="search-btn border-radius-s3" type="submit" value="搜 索">
				</form>
			</div>
				<div class="seek">
			        <a href="http://bbs.zol.com.cn/index.php?c=search&amp;kword=iPhone+8" target="_blank">iPhone 8</a>
            	    <a href="http://detail.zol.com.cn/cell_phone/index1174429.shtml" target="_blank">vivo X9s</a>
            	    <a href="http://bbs.zol.com.cn/index.php?c=search&amp;kword=mate9" target="_blank">华为Mate9</a>
            	    <a href="http://bbs.zol.com.cn/index.php?c=search&amp;kword=OPPO+R9s" target="_blank">OPPO R9s</a>
            	</div>
        </div>
	</div>
</div>
<!-- 搜索栏 结束 -->



<div class="wrapper">

	<div class="crumb">
		<a href="http://bbs.zol.com.cn/" target="_blank">ZOL论坛</a> 
		&gt; 
		<a href="http://bbs.zol.com.cn/sjbbs/" target="_blank">手机论坛</a> 
		&gt; 
		<a href="http://bbs.zol.com.cn/sjbbs/d1795.html" target="_blank">vivo智能手机手机论坛</a> 
		&gt; 
		<a href="http://bbs.zol.com.cn/sjbbs/x1210526.html" target="_blank">vivo Y71论坛</a> 
		&gt; 
		<a href="http://bbs.zol.com.cn/sjbbs/d1795_529922.html">官方进来看一下，</a>
	</div>


	<div class="pgs border-radius-s3 box-shadow clearfix">
	    <div class="pgs-nopage">帖子很冷清，卤煮很失落！
	    	<span class="border-radius-s3" id="popReplyBox">求安慰</span>
	    </div>
		<div class="btn-div">
			<!-- 发帖按钮 -->
			<div class="publish-btn">
			    <a href="#" target="_blank" class="fb-btn-up border-radius-s3 cir_btn">
			    	<span>快速回复</span>
			    </a>
        				
			</div>
		</div>
	</div>

	
	<div class="title-top border-radius-top box-shadow-top clearfix" id="bookTitle">
	  	<h1>官方进来看一下，</h1>
	  	<span class="title-icon"></span>  	
	  	<div class="title-else">
	  		<em>13</em>浏览 / <em>3</em>回复  	
	  	</div>
	</div>
	
	<!-- 帖子标题吸顶效果 -->
	<div class="title-top border-radius-top box-shadow fixed-title clearfix" id="bookFixedTitle" style="display: none;">
	  	<h3>官方进来看一下，</h3>
	  	<div class="host-btn">
	  	    <a class="btn border-radius-s3" href="http://bbs.zol.com.cn/sjbbs/d1795_529922_uid_likemore.html" rel="nofollow">只看楼主</a><a class="btn border-radius-s3" href="http://bbs.zol.com.cn/sjbbs/d1795_529922_back.html" rel="nofollow">倒序浏览</a><span id="closeFixedTitle" class="close"></span>
		</div>
	</div>
	
	
	<div class="fixed-host">
		<span class="fixed-host-ico" style="display: none;"></span>
		<div class="host-click-me" style="display: none;"><a href="http://bbs.zol.com.cn/sjbbs/d1795_529922.html###">点我</a></div>
		<div class="host-intro clearfix" style="display:none;">
			<div class="host-intro-come">
				<p class="fixed-host-special">楼主：<a href="http://my.zol.com.cn/bbs/likemore/" target="_blank">likemore</a></p>
				<p>来自：<a href="http://bbs.zol.com.cn/sjbbs/x1210526.html" target="_blank">vivo智能手机</a></p>
			</div>
					<div class="followbox host-intro-btns">
				<div class="attention" name="" id=""><a href="http://bbs.zol.com.cn/sjbbs/d1795_529922.html###" touid="595657" data-role="user-login" class="border-radius-s3 addFollow"><em>关注</em></a></div>
							<a class="join-btn border-radius-s3 attenBoardBtn" data-role="user-login" href="http://bbs.zol.com.cn/sjbbs/d1795_529922.html###">关注</a>
						</div>
					<span class="host-intro-arrow"></span>
		</div>
	</div>	
	
	<table class="post-list host-post box-shadow" data-id="likemore">
		<tbody>
			<tr>
				<td class="post-side" rowspan="3">
				<!-- 楼主信息区域 -->
				    <div class="portrait">
	<p class="name "><a class="user-name" href="http://my.zol.com.cn/bbs/likemore/">likemore</a></p>
	<div class="picbox" onmouseover="$(this).children(&#39;.user-infor&#39;).show();" onmouseout="$(this).children(&#39;.user-infor&#39;).hide();">
		<a class="pic" href="http://my.zol.com.cn/bbs/likemore/">
		  		  <img src="./show_files/ChMkJlmePvmIRw2PAABP1dQoJ8oAAf7pgM085AAAE_t506.jpg" alt="likemore" title="likemore" width="100" height="100">
		</a>
		<p class="urser-achievements"><span class="line"></span><a class="jing-num" href="http://my.zol.com.cn/index.php?c=bbs&amp;a=default&amp;order=good&amp;userid=likemore">1<br>精华</a><a class="post-num" href="http://my.zol.com.cn/index.php?c=bbs&amp;a=default&amp;order=wdate&amp;userid=likemore">5082<br>帖子</a></p>
				<!-- 用户信息弹层 -->
		<div class="pop user-infor box-shadow" style="display: none;">
			<div class="pop-inner">
				<p class="name"><a target="_blank" title="likemore" href="http://my.zol.com.cn/bbs/likemore/">likemore</a><span class="user-id">（ID:likemore）</span></p>
				
				<div class="pop-main ">
					<div class="picbox">
						<a class="pic" target="_blank" href="http://my.zol.com.cn/bbs/likemore/">
						  						  <img src="./show_files/ChMkJlmePvmIRw2PAABP1dQoJ8oAAf7pgM085AAAE_t506.jpg" alt="likemore" title="likemore" width="100" height="100">
						</a>
						<p class="urser-achievements"><span class="line"></span><span class="jing-num"><a href="http://my.zol.com.cn/index.php?c=bbs&amp;a=default&amp;order=good&amp;userid=likemore" target="_blank">1</a><br>精华</span><span class="post-num"><a target="_blank" title="" href="http://my.zol.com.cn/index.php?c=bbs&amp;a=default&amp;order=wdate&amp;userid=likemore">5082</a><br>帖子</span></p>
											</div>
					<ul class="clearfix">
						<li><span>粉丝：</span><a href="http://my.zol.com.cn/likemore/follower/" target="_blank">5</a></li>
						<li><span>关注：</span><a href="http://my.zol.com.cn/likemore/follow/" target="_blank">4</a></li>
						<li><span>Z金豆：</span><a href="http://jindou.zol.com/" target="_blank">0</a></li>
						<li><span>城市：</span>上海</li>
						<li><span>注册时间：</span>2004-09-20</li>
						<li><span>最后登录：</span>0000-00-00</li>
					</ul>
						
					<div class="enter-centerbox"><a href="http://my.zol.com.cn/likemore/" target="_blank" class="enter-center">进入个人中心&gt;&gt;</a></div>								
				</div>
			</div>
		</div>
	</div>

	<div class="level-box">
        <div class="level">
        	<!-- <div class="level-num"><span>秀才</span><em>Lv.4</em></div>
        	<div class="level-experience">经验: <em>2602</em></div>
        	 -->
        	<div class="level-num-news">等&nbsp;&nbsp;级：<em>Lv.4</em></div>
        	<div class="level-experience-news">经&nbsp;&nbsp;验：<em>2602</em></div>
        </div>
		<div class="level-pop box-shadow" style="display: none;">
			<i class="level-pop-trangle"></i>
			<p>当前经验<em>2602</em>分，升级还需<em>418</em>分</p>
			<p>下一等级：<b>Lv.5</b><a class="more" href="http://bbs.zol.com.cn/otherbbs/d4_6087.html" rel="nofollow">如何升级？</a></p>
		</div>
	</div>
        
	<ul class="infor-list">
			
		<li class="jd-item clearfix">
    		<span class="jd">Z金豆：</span> 
    		<a href="http://jindou.zol.com/" target="_blank">0</a>
    		<div class="jd-layerbox">
             	<i class="arrow-icon"></i>
             	<p>千万礼品等你来兑哦~快点击这里兑换吧~</p>
            </div>
		</li>
		<li><span>城&nbsp;&nbsp;市：</span>上海</li>
		<li><span>注&nbsp;&nbsp;册：</span>2004-09-20</li>
		<li><span>登&nbsp;&nbsp;录：</span>0000-00-00</li>
	</ul>
	
	<!-- 勋章位置 -->
		
	    <div class="followbox clearfix">
		<div class="attention"><a data-role="user-login"><em>关注</em></a></div>
	    <a class="sent-manage" data-role="user-login" rel="nofollow"><em>私信</em></a>
	</div>
		</div>				</td>
				<td class="post-title clearfix">
					<span class="publish-time">发表于 2018-07-28 07:35:32</span>
					<div class="host-btn">
					   <a class="btn border-radius-s3" href="http://bbs.zol.com.cn/sjbbs/d1795_529922_uid_likemore.html" rel="nofollow">只看楼主</a><a class="btn border-radius-s3" href="http://bbs.zol.com.cn/sjbbs/d1795_529922_back.html" rel="nofollow">倒序浏览</a>                  	</div>
					<!-- 百度分享 -->
					<div class="share-btns" id="showShareBox" data-insertbox="shareInsertBox" data-share="show">
						<span class="label border-radius-s3"><em>分享</em></span>
						<div id="shareInsertBox" style="display:none">
							<i class="trangle"></i>
						<div class="bdsharebuttonbox bdshare-button-style0-24" data-tag="nor-share" data-bd-bind="1532747655597"><a href="javascript:void(0);" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a><a href="javascript:void(0);" class="bds_weixin" data-cmd="weixin" title="分享到微信"></a><a href="javascript:void(0);" class="bds_tqq" data-cmd="tqq" title="分享到腾讯微博"></a><a href="javascript:void(0);" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a></div></div>			
					</div>
					<!-- //百度分享 end -->
										<div class="page-go">
						<span>电梯直达</span>
						<input class="text border-radius-s3" type="text" value="">
						<span>楼</span>
						<a href="javascript:;" id="goToFloor" class="fj-btn">确定</a>
					</div>
					<span class="host border-radius-s3" id="copyBookUrl">楼主</span>
				<div class="zclip" id="zclip-ZeroClipboardMovie_1" title="复制帖子链接到剪贴版" style="position: absolute; left: 1232.5px; top: 494px; width: 40px; height: 32px; z-index: 99;"><embed id="ZeroClipboardMovie_1" src="/js/public/ZeroClipboard.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="40" height="32" name="ZeroClipboardMovie_1" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=1&amp;width=40&amp;height=32" wmode="transparent"></div></td>
			</tr>
			
			
			
			<tr>
				<td class="post-main">
				
                    <!-- 约稿激励 -->
                                        <!-- 约稿激励end -->
                    
                    <!-- 首页收录 -->
                                        
				    <!-- 精华判断 -->
				    					<!-- 精华判断end -->

					<!-- 删帖申诉 S -->
															<!-- 删帖申诉 E -->
					
										<!-- 商城入口 -->
					<!-- <div class="tip-price">
						<div class="tip-left">
							<span><b><a href="http://www.zol.com/list/pro1210526.html?spm=1157.0" target="_blank">vivo Y71（3GB RAM/全网通）</a></b>
														<em>正品行货</em><em>无忧退换</em><em>顺丰包邮</em>
														</span>
							<p>【购机全返+顺丰包邮】vivo Y71 3GB+32GB 全网通</p>
						</div>
						<a href="http://www.zol.com/list/pro1210526.html?spm=1157.0" class="btn-pink" target="_blank">去购买</a>
						<span class="price">ZOL商城价：<font>￥1198</font></span>
					</div> -->
										
			        <!-- 楼主右侧文字链广告 -->
				    <div id="book_detail_ad_right_txt" class="ad-text"><div><!-- _bms_{"place":"first_right_ad_57_1795", "id": "adhook1"} --></div></div>    
				
					<!-- 楼主右侧广告图 -->
                    <div id="book_detail_ad_right_pic" class="advert"><div><!-- _bms_{"place":"sjbbs_cate2_topic_right_ad1", "id": "adhook1"} --></div></div>
					<!-- 活动贴 -->
										<!-- 活动贴end -->
					
					<!-- 众筹帖 -->
										<!-- 众筹帖end -->
                    <div>
                    
					</div>
					
					<!-- 帖子内容 -->
                    <div id="bookContent" class="gmine_ad">
					
为何我的没方法看更新日志，以前还有那个小三角图标呢，现在没有了。
<img src="./show_files/getPicture">


<br>					
										<!-- 定制品牌评分模块 -->
					<div class="pro-examine" id="proScoreModule">
	<div class="pro-examine-pic">
		<a href="http://detail.zol.com.cn/cell_phone/index1210526.shtml" target="_blank" class="pic"><img src="./show_files/ceDOe5HJ7gaA.jpg" alt=""></a>
		<a href="http://detail.zol.com.cn/cell_phone/index1210526.shtml" target="_blank" class="title" title="vivo Y71">vivo Y71</a>
		<p>参考价: <a href="http://detail.zol.com.cn/1211/1210526/price.shtml" target="_blank">￥1000.00</a></p>
		<p>热门排名: 第66名 </p>	</div>
		<div class="pro-examine-body clearfix">
			<div class="pro-examine-item examine-item-1">
			<div class="examine-result">                    				
				<div class="result-bar" style="height:1px;"><p class="number">1</p></div>
			</div>
			
			<label for="proExamine_1" data-role="user-login">
                <img class="examine-user" width="50" height="50" src="./show_files/maimaimai.png" alt="">
                <span>买买买</span>
                <input id="proExamine_1" type="radio" name="examine">
            </label>
		</div>
			<div class="pro-examine-item examine-item-2">
			<div class="examine-result">                    				
				<div class="result-bar" style="height:0px;"><p class="number">0</p></div>
			</div>
			
			<label for="proExamine_2" data-role="user-login">
                <img class="examine-user" width="50" height="50" src="./show_files/taiguile.png" alt="">
                <span>太贵了</span>
                <input id="proExamine_2" type="radio" name="examine">
            </label>
		</div>
			<div class="pro-examine-item examine-item-3">
			<div class="examine-result">                    				
				<div class="result-bar" style="height:0px;"><p class="number">0</p></div>
			</div>
			
			<label for="proExamine_3" data-role="user-login">
                <img class="examine-user" width="50" height="50" src="./show_files/yirushou.png" alt="">
                <span>已入手</span>
                <input id="proExamine_3" type="radio" name="examine">
            </label>
		</div>
			<div class="pro-examine-item examine-item-4">
			<div class="examine-result">                    				
				<div class="result-bar" style="height:0px;"><p class="number">0</p></div>
			</div>
			
			<label for="proExamine_4" data-role="user-login">
                <img class="examine-user" width="50" height="50" src="./show_files/maibudao.png" alt="">
                <span>买不到</span>
                <input id="proExamine_4" type="radio" name="examine">
            </label>
		</div>
			<div class="pro-examine-item examine-item-5">
			<div class="examine-result">                    				
				<div class="result-bar" style="height:0px;"><p class="number">0</p></div>
			</div>
			
			<label for="proExamine_5" data-role="user-login">
                <img class="examine-user" width="50" height="50" src="./show_files/shanzaihuo.png" alt="">
                <span>山寨货</span>
                <input id="proExamine_5" type="radio" name="examine">
            </label>
		</div>
			<div class="pro-examine-item examine-item-6">
			<div class="examine-result">                    				
				<div class="result-bar" style="height:0px;"><p class="number">0</p></div>
			</div>
			
			<label for="proExamine_6" data-role="user-login">
                <img class="examine-user" width="50" height="50" src="./show_files/buzhide.png" alt="">
                <span>不值得</span>
                <input id="proExamine_6" type="radio" name="examine">
            </label>
		</div>
			<div class="pro-examine-item examine-item-7">
			<div class="examine-result">                    				
				<div class="result-bar" style="height:0px;"><p class="number">0</p></div>
			</div>
			
			<label for="proExamine_7" data-role="user-login">
                <img class="examine-user" width="50" height="50" src="./show_files/meixingqu.png" alt="">
                <span>没兴趣</span>
                <input id="proExamine_7" type="radio" name="examine">
            </label>
		</div>
		</div>
	</div>
					
					   
					<style>
.tmall-activies{height:66px;padding:0;margin:0 auto;border:none;}
.tmall-pic{width: 80px;height: 60px;float:left;margin-right:10px;text-align: center}
.detail-text{float:left;}
.detail-text h3 a{font-weight: 400;}
.detail-text h3.title{padding:0;border:none;height:26px;line-height:26px;}
.detail-text h3 a:hover{color:#c00;}
.detail-text a{color:#333;}
.tags {margin-top: 10px;}
.tags a{display: block;height: 20px;line-height: 20px;float:left;margin-right:45px;font-size: 14px;}
.tags a:hover{text-decoration: none;color:#c00;}
.tags a img{vertical-align:top;margin-right:10px;display: inline-block;}
.tags a font{color:#cb0101;display: inline-block;margin-left:10px;}
</style>
<div class="tmall-activiesbox bb" style="margin-top: 20px;">
    <div class="tmall-activies">
        <a href="https://union-click.jd.com/sem.php?unionId=281&amp;siteid=20170818001&amp;to=http://item.jd.com/7920206.html" target="_blank" onclick="addHitEvent(&#39;bbs_pc_detail_jd&#39;,&#39;&#39;,window.location.href);" class="tmall-pic"><img src="./show_files/cexKY4svISfSc.jpg" width="80" height="60" alt=""></a>
        <div class="detail-text">
            <h3 class="title"><a href="https://union-click.jd.com/sem.php?unionId=281&amp;siteid=20170818001&amp;to=http://item.jd.com/7920206.html" target="_blank" onclick="addHitEvent(&#39;bbs_pc_detail_jd&#39;,&#39;&#39;,window.location.href);">vivo Y71 全面屏手机 3GB+32GB 香槟金 移动联通电信</a></h3>
            <div class="tags">
                                <a href="https://union-click.jd.com/sem.php?unionId=281&amp;siteid=20170818001&amp;to=http://item.jd.com/7920206.html" target="_blank" onclick="addHitEvent(&#39;bbs_pc_detail_jd&#39;,&#39;&#39;,window.location.href);" class="jd"><img width="17" height="17" src="./show_files/jd.png" class="icon">京东<font>￥999.00</font></a>
                                <a href="http://detail.tmall.com/item.htm?id=573704794610&amp;spm=a211sq.11321921.1512.573704794610" target="_blank" onclick="addHitEvent(&#39;bbs_pc_detail_tmall&#39;,&#39;&#39;,window.location.href);" class="tmall"><img width="17" height="17" src="./show_files/tmall-wap-export.jpg" class="icon">天猫商城<font>￥999</font></a>
                            </div>
        </div>
    </div>
</div>
					     
                    <!-- 打赏 --> 
                    <!-- 打赏 -->
                     
                    <!-- 活动贴 -->
										<!-- 活动贴end -->
					 
				    <!-- 众筹帖 -->
										<!-- 众筹帖end -->
					              
					<!-- 帖子内容end -->
					<!-- 蜜蜂来源 -->
										
					<!-- 楼层内回复 -->
					
										<div class="replybox">
					    <a href="http://www.zol.com.cn/help/index.html" class="app" target="_blank">下载ZOL客户端，随时随地与大家交流</a>
						<span class="reply-header border-radius-top">发表回复</span>
						<div class="reply-cont border-radius-bottom">
							<div class="reply">
								<textarea id="replyBoxContent" class="textarea border-radius-s3" placeholder="回复有价值的内容，才是对作者最大的支持" value=""></textarea>
							</div>
							<div class="reply-option clearfix">
								<div class="reply-shorcut"><a href="javascript:;" class="expression" id="replyBoxEmotion">表情</a><a href="http://bbs.zol.com.cn/index.php?c=publish&amp;a=reply&amp;boardid=1795&amp;bookid=529922&amp;bbsid=5" target="_blank">高级回复</a></div>
								<a href="javascript:;" class="btn-blue border-radius-s3" id="replyBoxBtn" flag="1">回复</a>
								                                							</div>
						</div>
					</div>
										
					<!-- 活动贴 -->
										<!-- 活动贴end -->
					
					<!-- 众筹帖 -->
										<!-- 众筹帖end -->
					<!-- 评分模块 -->
										
					<!-- 针对主贴评分及收藏 -->
										    <div class="hostPost-options">
        					    <a class="btn-pink  border-radius-s3 " href="http://bbs.zol.com.cn/sjbbs/d1795_529922.html###" data-role="user-login">评分</a>
        					    <a class="btn-blue  border-radius-s3" href="http://bbs.zol.com.cn/sjbbs/d1795_529922.html###" data-role="user-login">收藏</a>
        					    <span class="btn-book-favour  border-radius-s3" href="###" data-login="0" id="noLoginFavourBook" data-role="user-login"><span>赞</span></span>
        					</div>
					            	    <!-- _bms_{"place":"detail_score_down", "id": "adhook1"} -->
				<div id="ezrrbhifo"><iframe width="810" frameborder="0" height="90" scrolling="no" src="./show_files/s(1).html"></iframe></div><script src="./show_files/ezrrbhifo.js.下载"></script></div></td>
			</tr>
			
			
			<tr>
				<td class="post-footer">
				
				    <!-- 楼主热贴 -->
 <!-- 楼主热贴 -->
<style>
.section .section-cont{padding: 15px 0 15px 26px;}
.section .hotpost-list{width: 350px;}
.section .product{width:400px;margin-right: 20px;}
.section .product .title{height: 30px;line-height: 30px;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;}
.section .parameter{margin-top: 10px;width: 280px;float:left;}
.section .product a.pic{float:left;width: 120px;height: 90px;display: block}
.parameter ul{width:300px;}
.parameter li{float:left;margin-right:10px;line-height: 30px;font-size:14px;width: 140px;text-align: left;}
.parameter li i{width:16px;height: 16px;display: inline-block;vertical-align: middle;margin-right: 5px;}
.parameter li.tmall i{background: url(https://icon.zol-img.com.cn/ask/2017/mallentrance/pc_tmall.png) no-repeat;}
.parameter li.jd i{background: url(https://icon.zol-img.com.cn/ask/2017/mallentrance/pc_jd.png) no-repeat;}
.parameter li.amazon i{background: url(https://icon.zol-img.com.cn/ask/2017/mallentrance/pc_amazon.png) no-repeat;}
.parameter li.zol i{background: url(https://icon.zol-img.com.cn/ask/2017/mallentrance/pc_zol.png) no-repeat;}
.parameter li font{color:#f00;}
.par-foot-link{text-align: left;margin-top:10px;}
.section .product img {display: block;margin:5px 0 0 0;}
</style>
<div class="host-recPost host-pro-recPost clearfix" style=";">
	<div class="section host-hotPost border-radius-s3">
		<i class="trangle-left"></i>
		<i class="trangle-right"></i>
		<div class="section-head">
			<h3>相关推荐</h3>
			<div class="section-location">
			    <a href="http://detail.zol.com.cn/cell_phone_index/subcate57_list_1.html" target="_blank">手机</a> &gt; 
			    <a href="http://detail.zol.com.cn/cell_phone_index/subcate57_1795_list_1.html" target="_blank">vivo</a> &gt; 
			    <a href="http://detail.zol.com.cn/cell_phone/index1210526.shtml" target="_blank">vivo Y71（3GB RAM/全网通）</a>
			</div>
		</div>
		<div style="padding-left:15px;" class="section-cont clearfix">
    		    <ul class="hotpost-list">
    		                    		<li><img src="./show_files/jing.png" alt=""><a href="http://bbs.zol.com.cn/dcbbs/d232_834916.html" target="_blank">针对版主齐摄影的严重问题《美女与花朵》三，赶紧进来看看怎么回...</a></li>
    		                    		<li><img src="./show_files/lt.png" alt=""><a href="http://bbs.zol.com.cn/diybbs/d231_867498.html" target="_blank">求助各位大神！进来帮忙看看！</a></li>
    		                    		<li><img src="./show_files/lt.png" alt=""><a href="http://bbs.zol.com.cn/diybbs/d231_867522.html" target="_blank">麻烦老哥们进来给我这个小白一点意见</a></li>
    		                    		<li><img src="./show_files/lt.png" alt=""><a href="http://bbs.zol.com.cn/sjbbs/d36850_53023.html" target="_blank">荣耀v9抢不到的进来看看哦</a></li>
    		                    		<li><img src="./show_files/lt.png" alt=""><a href="http://bbs.zol.com.cn/sjbbs/d36850_52895.html" target="_blank">感觉V9发热严重的花友进来看下- - 已回复</a></li>
    		            			</ul>
						<div class="product">
				<!--<a href="http://detail.zol.com.cn/cell_phone/index1210526.shtml" target="_blank"><img alt="" width="80" height="60" src="https://pro-fd.zol-img.com.cn/t_s120x90/g5/M00/0D/0B/ChMkJlrZtKOIIrHdAADU8vFQ7YsAAnxTwJGnlcAANUK030.jpg"></a>
				<div class="parameter">
				    <a href="http://detail.zol.com.cn/cell_phone/index1210526.shtml" target="_blank">[综述]</a><a href="http://detail.zol.com.cn/1211/1210526/param.shtml" target="_blank">[参数]</a><a href="http://detail.zol.com.cn/1211/1210526/pic.shtml" target="_blank">[图片]</a><a href="http://detail.zol.com.cn/1211/1210526/price.shtml" target="_blank">[报价]</a><a href="http://detail.zol.com.cn/1211/1210526/review.shtml" target="_blank">[点评]</a>
				</div>-->
				<h3 class="title" title="vivo Y71 全面屏手机 3GB+32GB 香槟金 移动联通电信"><a href="https://union-click.jd.com/sem.php?unionId=281&amp;siteid=20170818001&amp;to=http://item.jd.com/7920206.html" target="_blank" onclick="addHitEvent(&#39;bbs_pc_book_jd&#39;,&#39;&#39;,window.location.href);">vivo Y71 全面屏手机 3GB+32GB 香槟金 移动联通电信</a></h3>
				<a href="https://union-click.jd.com/sem.php?unionId=281&amp;siteid=20170818001&amp;to=http://item.jd.com/7920206.html" class="pic" target="_blank"><img alt="" width="100" height="80" src="./show_files/cexKY4svISfSc.jpg"></a>
				<div class="parameter">
                    <ul class="clearfix">
                                                                        <li class="jd"><a target="_blank" style="display:inline-block;width:159px;" href="https://union-click.jd.com/sem.php?unionId=281&amp;siteid=20170818001&amp;to=http://item.jd.com/7920206.html"><i></i>京东&nbsp;&nbsp;<font>￥999.00</font></a></li>
                                                                        <li class="tmall"><a target="_blank" style="display:inline-block;width:159px;" href="http://detail.tmall.com/item.htm?id=573704794610&amp;spm=a211sq.11321921.1512.573704794610"><i></i>天猫商城&nbsp;&nbsp;<font>￥999</font></a></li>
                                            </ul>
                    
                    <p class="par-foot-link">                       
                         <a href="http://detail.zol.com.cn/cell_phone/index1210526.shtml" target="_blank">[综述]</a><a href="http://detail.zol.com.cn/1211/1210526/param.shtml" target="_blank">[参数]</a><a href="http://detail.zol.com.cn/1211/1210526/pic.shtml" target="_blank">[图片]</a><a href="http://detail.zol.com.cn/1211/1210526/price.shtml" target="_blank">[报价]</a><a href="http://detail.zol.com.cn/1211/1210526/review.shtml" target="_blank">[点评]</a>
                    </p>
				</div>
			</div>
					</div>
	</div>
</div>	

				    					<div class="sign" data-userid="likemore">
						<span class="label">个性签名：</span><span class="userSign"> </span>				        					</div>
					
					<div class="main-options clearfix">
						<!-- 百度分享 -->
						<div class="share-btns" data-share="show">
							<span class="label">分享到：</span>
						<div class="bdsharebuttonbox bdshare-button-style0-24" data-tag="nor-share" data-bd-bind="1532747655597"><a href="javascript:void(0);" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a><a href="javascript:void(0);" class="bds_weixin" data-cmd="weixin" title="分享到微信"></a><a href="javascript:void(0);" class="bds_tqq" data-cmd="tqq" title="分享到腾讯微博"></a><a href="javascript:void(0);" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a></div></div>
						<!-- //百度分享 end -->
						<div class="options">
							<div class="options-btns clearfix">
							    							    							        								    <a class="btn border-radius-s3" data-role="user-login" href="http://bbs.zol.com.cn/sjbbs/d1795_529922.html###">举报</a>
							    								            							<a class="btn border-radius-s3" href="http://bbs.zol.com.cn/sjbbs/d1795_529922_uid_likemore.html">只看此人</a>
        							        							<a class="btn-blue btn-2 border-radius-s3" href="http://bbs.zol.com.cn/sjbbs/d1795_529922.html###" id="replyAuthorBtn">回复</a>
        							        							    <a class="btn-blue btn-2 border-radius-s3" data-role="user-login" href="http://bbs.zol.com.cn/sjbbs/d1795_529922.html###">评分</a>
        							    <!--<a class="btn-blue btn-2 border-radius-s3" href="###" data-role="user-login">回复</a>-->
        														</div>
						</div>
					
					</div>
					<!-- //main-options end -->
				</td>
			</tr>
	</tbody>
	</table>
	
	
	<table class="post-list  box-shadow replyList" data-id="vivian333">
		<tbody>
			<tr>
			<td class="post-side" rowspan="3">
				<div class="portrait">
										<p class="name "><a class="user-name" href="http://my.zol.com.cn/bbs/vivian333/" target="_blank">vivian333</a></p>
										<div class="picbox" onmouseover="$(this).children(&#39;.user-infor&#39;).show();" onmouseout="$(this).children(&#39;.user-infor&#39;).hide();">
						<a class="pic " href="http://my.zol.com.cn/bbs/vivian333/" target="_blank">
						  						  <img src="./show_files/ChMkJ1mePvmIYurOAAAYsms98vYAAf7pgMuqw8AABjK409.jpg" alt="vivian333" title="vivian333" width="100" height="100">
						  						</a>
												<p class="urser-achievements"><span class="line"></span><a class="jing-num" href="http://my.zol.com.cn/index.php?c=bbs&amp;a=default&amp;order=good&amp;userid=vivian333">0<br>精华</a><a class="post-num" href="http://my.zol.com.cn/index.php?c=bbs&amp;a=default&amp;order=wdate&amp;userid=vivian333">52<br>帖子</a></p>
																		<!-- 用户信息弹层 -->
						<div class="pop user-infor box-shadow" style="display: none;">
							<div class="pop-inner">
																<p class="name"><a href="http://my.zol.com.cn/bbs/vivian333/" target="_blank">vivian333</a><span class="user-id">（ID:vivian333）</span></p>
																<div class="pop-main ">
									<div class="picbox">
										<a class="pic " href="http://my.zol.com.cn/bbs/vivian333/" target="_blank">
										  										  <img src="./show_files/ChMkJ1mePvmIYurOAAAYsms98vYAAf7pgMuqw8AABjK409.jpg" alt="vivian333" title="vivian333" width="100" height="100">
										  										</a>
																				<p class="urser-achievements"><span class="line"></span><span class="jing-num"><a href="http://my.zol.com.cn/index.php?c=bbs&amp;a=default&amp;order=good&amp;userid=vivian333" target="_blank">0</a><br>精华</span><span class="post-num"><a href="http://my.zol.com.cn/index.php?c=bbs&amp;a=default&amp;order=wdate&amp;userid=vivian333" target="_blank">52</a><br>帖子</span></p>
																													</div>
									<ul class="clearfix">
																				<li><span>粉丝：</span><a href="http://my.zol.com.cn/vivian333/follower/" target="_blank">0</a></li>
										<li><span>关注：</span><a href="http://my.zol.com.cn/vivian333/follow/" target="_blank">0</a></li>
										<li><span>Z金豆：</span><a href="http://jindou.zol.com/" target="_blank">0</a></li>
										<li><span>城市：</span>北京</li>
										<li><span>注册时间：</span>2009-03-13</li>
										<li><span>最后登录：</span>2010-05-29</li>
																				
									</ul>
																			
									<div class="enter-centerbox"><a href="http://my.zol.com.cn/vivian333/" class="enter-center" target="_blank">进入个人中心&gt;&gt;</a></div>								
																	</div>
							</div>
						</div>
					</div>
					
					<div class="level-box">
                    		                    		<div class="level">
                            	<!-- <div class="level-num"><span>平民</span><em>Lv.1</em></div>
                            	<div class="level-experience">经验: <em>24</em></div> -->
                                <div class="level-num-news">等&nbsp;&nbsp;级：<em>Lv.1</em></div>
        	                    <div class="level-experience-news">经&nbsp;&nbsp;验：<em>24</em></div>
                            </div>
                    		<div class="level-pop box-shadow" style="display: none;">
                    			<i class="level-pop-trangle"></i>
                    			<p>当前经验<em>24</em>分，升级还需<em>256</em>分</p>
                    			<p>下一等级：<b>Lv.2</b><a class="more" href="http://bbs.zol.com.cn/otherbbs/d4_6087.html" rel="nofollow">如何升级？</a></p>
                    		</div>
                    		                    	</div>
					
					<ul class="infor-list">
						                	    						<!-- <li class="jd-item clearfix">
    						<span class="jd">Z金豆：</span> 
                    		<a href="//jindou.zol.com/" target="_blank">0</a>
                    		<div class="jd-layerbox">
                             	<i class="arrow-icon"></i>
                             	<p>千万礼品等你来兑哦~快点击这里兑换吧~</p>
                            </div>
						</li>
						<li><span>城&nbsp;&nbsp;市：</span>北京</li>
						<li><span>注&nbsp;&nbsp;册：</span>2009-03-13</li>
						<li><span>登&nbsp;&nbsp;录：</span>2010-05-29</li> -->
											</ul>
					
					<!-- 勋章 -->
					                	
						                    <div class="followbox clearfix">
	            			<div class="attention"><a data-role="user-login"><em>关注</em></a></div>
	                	    <a class="sent-manage" data-role="user-login" rel="nofollow"><em>私信</em></a>
	                	</div>
	                	                					</div>
			</td>
			<td class="post-title clearfix">
				<span class="publish-time">发表于 2018-07-28 08:15:53</span>
				<span class="floor">1楼</span>
			<div class="zclip" id="zclip-ZeroClipboardMovie_2" title="复制帖子链接到剪贴版" style="position: absolute; left: 1409.28px; top: 3462px; width: 22px; height: 32px; z-index: 99;"><embed id="ZeroClipboardMovie_2" src="/js/public/ZeroClipboard.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="22" height="32" name="ZeroClipboardMovie_2" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=2&amp;width=22&amp;height=32" wmode="transparent"></div></td>
		</tr>
		</tbody>
	</table>
	
	
	<br />
	<br />
	<br />
	<br />
</div>










		
	</body>
</html>

