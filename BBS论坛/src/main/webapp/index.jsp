<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	
		<script type="text/javascript" src="./index_files/pr.js"></script>
		<script type="text/javascript" src="./index_files/jdhlbb.js"></script>
		<title>BBS论坛首页</title>
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


<script type="text/javascript">


	function showAddModal(){
		$("#addModal").modal("show");
	}

	function showLoginModal(){
		$("#loginModal").modal("show");
	}

	function showPostModal(){
		$("#postModal").modal("show");
	}
</script>

</head>

<body style="">
<span style="display:none" id="z_bbs_login">登录</span>

<!-- 公共头部 开始-->
<div class="pub-bbs-top">
	<div class="pub-bbs-top-inner clearfix">
		<ul class="pub-bbs-nav">
            <li class="pub-nav-home"><a target="_blank" href="http://www.zol.com.cn/">西安科技大学</a></li>
        	<li><a target="_blank" href="http://detail.zol.com.cn/">新卓越</a></li>
        	<li><a target="_blank" href="http://www.zol.com/">百度贴吧</a></li>
        	<li><a target="_blank" href="http://bbs.zol.com.cn/">其他</a></li>
        	<li class="pub-menu" id="pubBbs">
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
		<style type="text/css">
           .quick-login .ql-qq,.quick-login .ql-wechat,.quick-login .ql-sina{width:24px;height:24px;background:url(https://icon.zol-img.com.cn/service/updatepic/y_share.png) no-repeat;}
           .quick-login .ql-qq{background-position:0px -72px;}
           .quick-login .ql-wechat{background-position:0px -1px;}
           .quick-login .ql-sina{background-position:0px -38px;}
        </style>
		
        <ul class="pub-bbs-login">
        	
        	<c:choose>
        		<c:when test="${empty USERSINFO }">
        			<li class="pub-user-bar">
        				<span>${ERROR }</span>
		        		<span>请 [<a href="javascript:showAddModal()">注册</a>]</span>
		        		<span>[<a href="javascript:showLoginModal()">登录</a>]</span>
		        	</li>
        		</c:when>
        		<c:otherwise>
        			<li class="pub-user-bar">
        				<span>欢迎,${USERSINFO.usernickname } <a href="#">注销</a></span>
        			</li>
        		</c:otherwise>
        	</c:choose>
        	
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

<!-- 主体最大DIV,负责将页面内容居中 -->
<div class="wrapper">
	<!-- 导航栏 开始 -->
	<div class="navbox border-radius-s3">
		<ul class="nav-list">
			<c:forEach var="bi" items="${ALLBLOCKS }" >
				<c:choose>
					<c:when test="${param.blockid==bi.blockId }">
						<li><a class="border-radius-left current" href="post?type=findbyid&id=${bi.blockId }">${bi.blockName }</a></li>
					</c:when>
					<c:otherwise>
						<li><a class="border-radius-left" href="post?type=findbyid&id=${bi.blockId }">${bi.blockName }</a></li>
					</c:otherwise>
				</c:choose>
				
			</c:forEach>
		</ul>
	</div>
	<!-- 导航栏 结束 -->
	
	
	
	<div class="crumb">
		<a href="#" target="_blank">ZOL论坛</a> 
		&gt; 
		<a href="#">手机论坛</a>
	</div>
	<!-- 轮播图 关注榜 热帖 开始 -->
	<div class="wrap-top clearfix" id="slideContainer">
		<!-- 轮播焦点图 开始 -->
		<div class="focus">
			<div class="focus-pics" id="slidesImgs">
				<ul class="focus-pics-list clearfix">
					<li style="display: none;">
						<a href="#" target="_blank" class="pic"><img class="border-radius-s3" width="320" height="240" src="./index_files/ChMkJ1sx48yIBc91AABdGrPtkvYAApTSQAftRoAAF0y822.jpg" alt="黑莓新的活力"></a>
						<a href="#" target="_blank" class="pic-infor border-radius-s3">黑莓新的活力</a>
					</li>
				
					<li style="display: none;">
						<a href="#" target="_blank" class="pic"><img class="border-radius-s3" width="320" height="240" src="./index_files/ChMkJlrpZFKISHxDAAAn-O-jRo8AAoBEAPG4cAAACgQ317.jpg" alt="不走寻常路的坚果3"></a>
						<a href="#" target="_blank" class="pic-infor border-radius-s3">不走寻常路的坚果3</a>
					</li>
				
					<li style="display: none;">
						<a href="#" target="_blank" class="pic"><img class="border-radius-s3" width="320" height="240" src="./index_files/ChMkJ1pBty2ITE8nAABSFhYAzYgAAjfvQD5sr8AAFIu673.jpg" alt="最贵的苹果iPhone X拆机"></a>
						<a href="#" target="_blank" class="pic-infor border-radius-s3">最贵的苹果iPhone X拆机</a>
					</li>
				
					<li style="display: none;">
						<a href="#" target="_blank" class="pic"><img class="border-radius-s3" width="320" height="240" src="./index_files/ChMkJ1pBwVCISDBeAAC6nMtnk14AAjf0wFAjXoAALq0845.jpg" alt="一加5T手机试用招募"></a>
						<a href="#" target="_blank" class="pic-infor border-radius-s3">一加5T手机试用招募</a>
					</li>
					<li style="display: block;">
						<a href="#" target="_blank" class="pic"><img class="border-radius-s3" width="320" height="240" src="./index_files/ChMkJlo7Ek6IPyGDAABP-HJnx6MAAjWiAPhUggAAFAQ451.jpg" alt="6GB能开启多少个APP"></a>
						<a href="#" target="_blank" class="pic-infor border-radius-s3">6GB能开启多少个APP</a>
					</li>	
				</ul>
			</div>
			<div class="focus-index clearfix" id="slideBar">
				<span class="current">1</span>
				<span class="">2</span>
				<span class="">3</span>
				<span class="">4</span>
				<span class="">5</span>
			</div>
		</div>
		<!-- 轮播焦点图 结束 -->
		
		<!-- 粉丝关注品牌榜 开始-->
		<div class="section border-radius-s3 box-shadow">
		    <a href="#" class="more-link" target="_blank">更多</a>
			<h3 class="rec-title brank-rank-title">粉丝关注品牌榜</h3>
			<div class="brand-rank">
				<div class="brand-rank-header clearfix">
	                <span class="cell-1">排名</span>
	                <span class="cell-2">版块</span>
	                <span class="cell-3">热度</span>
	            </div>
	            <ul class="brand-rank-list">
	            	<li class="first current">
						<span class="n1">1</span>
						<span class="brand-num">180300</span>
						<b class="arr">-</b>
						<div class="rank-inner">
							<a href="#" target="_blank" class="title">vivo智能手机</a>
						</div>
						<div class="brand-describe clearfix">
							<a href="#" title="难以忘怀的“vivo NEX升动北京”世界杯非凡之夜" target="_blank" class="latest-post">难以忘怀的“vivo NEX升动北京”世界杯非凡之夜</a>
							<a href="#" title="vivo NEX升动北京,,世界杯非凡之夜活动回顾,法兰西胜利之夜" target="_blank" class="latest-post">vivo NEX升动北京,,世界杯非凡之夜活动回顾,法兰西胜利之夜</a>
						</div>
					</li>
					<li class="">
						<span class="n2">2</span>
						<span class="brand-num">74000</span>
						<b class="arr">-</b>
						<div class="rank-inner">
							<a href="http://bbs.zol.com.cn/sjbbs/d34002.html" target="_blank" class="title">小米</a>
						</div>
						<div class="brand-describe clearfix">
							<a href="http://bbs.zol.com.cn/sjbbs/d34002_206773.html" title="小小米 6X和8SE那个更值得买啊，" target="_blank" class="latest-post">小小米 6X和8SE那个更值得买啊，</a>
							<a href="http://bbs.zol.com.cn/sjbbs/d34002_203166.html" title="小小米 6X耗电量真的是太感人了！！！" target="_blank" class="latest-post">小小米 6X耗电量真的是太感人了！！！</a>
						</div>
					</li>
					<li class="">
						<span class="n3">3</span>
						<span class="brand-num">24150</span>
						<b class="arr">-</b>
						<div class="rank-inner">
							<a href="http://bbs.zol.com.cn/sjbbs/d613.html" target="_blank" class="title">华为</a>
						</div>
						<div class="brand-describe clearfix">
							<a href="http://bbs.zol.com.cn/sjbbs/d613_742877.html" title="#每日话题# 苹果中国响应税调政策：iPhone 8/X/iPad等全线降价" target="_blank" class="latest-post">#每日话题# 苹果中国响应税调政策：iPhone 8/X/iPad等全线降价</a>
							<a href="http://bbs.zol.com.cn/sjbbs/d613_742777.html" title="华为P20Pro 24小时使用体验" target="_blank" class="latest-post">华为P20Pro 24小时使用体验</a>
						</div>
					</li>
					<li class="">
						<span class="n4">4</span>
						<span class="brand-num">16850</span>
						<b class="arr">-</b>
						<div class="rank-inner">
							<a href="http://bbs.zol.com.cn/sjbbs/d98.html" target="_blank" class="title">三星</a>
						</div>
						<div class="brand-describe clearfix">
							<a href="http://bbs.zol.com.cn/sjbbs/d98_321354.html" title="三星S9勃艮第红，高颜值真机来袭" target="_blank" class="latest-post">三星S9勃艮第红，高颜值真机来袭</a>
							<a href="http://bbs.zol.com.cn/sjbbs/d98_320356.html" title="从此三星决缘！！！" target="_blank" class="latest-post">从此三星决缘！！！</a>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<!-- 粉丝关注品牌榜 结束-->
		<!-- 热帖排行 开始-->
		<div class="section border-radius-s3 box-shadow">
				<h3 class="rec-title hotrank-title">热帖排行</h3>
				<ul class="hot-tabs clearfix">
					<li class="" tabindex="1">24小时</li>
					<li tabindex="2" class="current">本周</li>
					<li tabindex="3">本月</li>
				</ul>
				<ul class="hot-news" id="tabBody_1" style="display: none;">
				  	<li class="first current">
						<span class="num">1.</span>
						<a class="title" href="#" title="小米8缩小版 时尚大气的亮红小米8SE开箱分享" target="_blank">小米8缩小版 时尚大气的亮红小米8SE开箱分享</a>
						<span class="numbox">
							<span class="view-num">34</span>
							<span class="reply-num">10</span>
						</span>
					</li>
					<li class="">
						<span class="num">2.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d1434_52728.html" title="魅族16花样邀请函再度来袭 这次是洗发水" target="_blank">魅族16花样邀请函再度来袭 这次是洗发水</a>
						<span class="numbox">
							<span class="view-num">30</span>
							<span class="reply-num">3</span>
						</span>
					</li>
					<li class="">
						<span class="num">3.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d1673_32017.html" title="oppo R11 打王者荣耀好用吗，深圳在哪儿买比较好" target="_blank">oppo R11 打王者荣耀好用吗，深圳在哪儿买比较好</a>
						<span class="numbox">
							<span class="view-num">29</span>
							<span class="reply-num">7</span>
						</span>
					</li>
					<li class="">
						<span class="num">4.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d34002_231828.html" title="这充电速度连qc10.0都达不到吧" target="_blank">这充电速度连qc10.0都达不到吧</a>
						<span class="numbox">
							<span class="view-num">23</span>
							<span class="reply-num">5</span>
						</span>
					</li>
					<li class="">
						<span class="num">5.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d34002_231838.html" title="红米五周年庆典明日开启，五大福利等你来！" target="_blank">红米五周年庆典明日开启，五大福利等你来！</a>
						<span class="numbox">
							<span class="view-num">23</span>
							<span class="reply-num">20</span>
						</span>
					</li>
				</ul>
				<ul class="hot-news" style="" id="tabBody_2">
					<li class="first">
						<span class="num">1.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d34002_227057.html" title="魅族16这是要撬米8的墙角啊" target="_blank">魅族16这是要撬米8的墙角啊</a>
						<span class="numbox">
							<span class="view-num">231</span>
							<span class="reply-num">5</span>
						</span>
					</li>
					<li class="">
						<span class="num">2.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d613_747088.html" title="华为nova3" target="_blank">华为nova3</a>
						<span class="numbox">
							<span class="view-num">164</span>
							<span class="reply-num">3</span>
						</span>
					</li>
					<li class="current">
						<span class="num">3.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d34116_190311.html" title="刺激战场大鸡腿最强辅助" target="_blank">刺激战场大鸡腿最强辅助</a>
						<span class="numbox">
							<span class="view-num">138</span>
							<span class="reply-num">6</span>
						</span>
					</li>
					<li class="">
						<span class="num">4.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d34130_184167.html" title="安卓机越用越慢？不一定！可能是我用手机的姿势不对" target="_blank">安卓机越用越慢？不一定！可能是我用手机的姿势不对</a>
						<span class="numbox">
							<span class="view-num">95</span>
							<span class="reply-num">9</span>
						</span>
					</li>
					<li class="">
						<span class="num">5.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d1795_516610.html" title="看了x20的正式版，感觉vivo是来搞笑的" target="_blank">看了x20的正式版，感觉vivo是来搞笑的</a>
						<span class="numbox">
							<span class="view-num">82</span>
							<span class="reply-num">13</span>
						</span>
					</li>
				</ul>
				<ul class="hot-news" style="display:none" id="tabBody_3">
					<li class="first current">
						<span class="num">1.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d1795_497146.html" title="难以忘怀的“vivo NEX升动北京”世界杯非凡之夜" target="_blank">难以忘怀的“vivo NEX升动北京”世界杯非凡之夜</a>
						<span class="numbox">
							<span class="view-num">9394</span>
							<span class="reply-num">63</span>
						</span>
					</li>
					<li class="">
						<span class="num">2.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d1795_496854.html" title="vivo NEX升动北京，世界杯非凡之夜，非凡一升，突破未来！" target="_blank">vivo NEX升动北京，世界杯非凡之夜，非凡一升，突破...</a>
						<span class="numbox">
							<span class="view-num">4400</span>
							<span class="reply-num">7</span>
						</span>
					</li>
					<li class="">
						<span class="num">3.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d34130_183971.html" title="vivo新机曝光！屏下镜头+10GB夸张内存超越NEX！蓝厂今年到底怎么了？" target="_blank">vivo新机曝光！屏下镜头+10GB夸张内存超越NEX！蓝厂...</a>
						<span class="numbox">
							<span class="view-num">3922</span>
							<span class="reply-num">8</span>
						</span>
					</li>
					<li class="">
						<span class="num">4.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d1795_496188.html" title="vivo NEX升动北京-世界杯非凡之夜活动happy_life2008现场报道" target="_blank">vivo NEX升动北京-世界杯非凡之夜活动happy_life200...</a>
						<span class="numbox">
							<span class="view-num">3649</span>
							<span class="reply-num">3</span>
						</span>
					</li>
					<li class="">
						<span class="num">5.</span>
						<a class="title" href="http://bbs.zol.com.cn/sjbbs/d1673_30895.html" title="oppo谁买谁上当" target="_blank">oppo谁买谁上当</a>
						<span class="numbox">
							<span class="view-num">858</span>
							<span class="reply-num">10</span>
						</span>
					</li>
				</ul>
		</div>
		<!-- 热帖排行 结束-->
	</div>
	<!-- 轮播图 关注榜 热帖 结束 -->
	
	<!-- 版块名称 开始 -->
	<div class="moderator-header clearfix">
	   <h1>手机论坛</h1>
		<div class="attention-box">
		<!-- 众信旅游冠名 -->
		</div>
	</div>
	<!-- 版块名称 结束 -->
	<!-- 版块介绍 开始 -->
	<div class="moderator-else">
		<p><span>今日：<a href="http://bbs.zol.com.cn/sjbbs/new/" target="_blank"><em class="pink-txt">2362</em></a></span><span>主题：1.5万</span><span>帖子数：4984.4万</span></p>
		<div class="moderator-names">
			<span class="pink-txt" style="color:#333;">版主：</span>
			<a href="http://my.zol.com.cn/bbs/kyl5201314/" target="_blank">kyl5201314</a>
			<a href="http://my.zol.com.cn/bbs/qq_15m789084115/" target="_blank">放飛梦缃</a>
			<a href="http://my.zol.com.cn/bbs/r7xjmd/" target="_blank">清纯帅气小馒头</a>
			<a href="http://my.zol.com.cn/bbs/qq_xzi403d15540397/" target="_blank">Double豆</a>
			<a href="http://my.zol.com.cn/bbs/bh1ejc/" target="_blank">榴莲班戟</a>
			<a href="http://my.zol.com.cn/bbs/ldbzhuchen/" target="_blank">Iam福禄</a>
		</div>
	</div>
	<!-- 版块介绍 结束 -->
	
	<div class="list-main box-shadow border-radius-s3">
	<table class="list " id="bookList">
		<tbody>
			<tr class="list-title">
				<td colspan="2">
					<div class="typebox">
						<label class="check-label" for="new-open">
							<input id="new-open" name="ch1" type="checkbox" checked="">新标签打开
						</label>
						<a class="current">最新回复</a> 
						| 
						<a href="http://bbs.zol.com.cn/sjbbs/new.html#c">最新发布</a> 
						| 
						<a href="http://bbs.zol.com.cn/sjbbs/reply.html#c">最多回复</a> 
						| 
						<a href="http://bbs.zol.com.cn/sjbbs/hot.html#c">最多查看</a> 
						| 						
					</div>
				</td>
				<td class="author">作者/时间</td>
    			<td class="reply">回复/查看</td>
    			<td class="last-post">最后回复</td>						
			</tr>
			<style>
				.ad-activies{width: 676px;height:88px;padding: 0 36px 12px 33px;overflow: hidden;}
				.ad-activies .pic{float:left;margin-right: 40px;}
				.price-list{margin:10px 0 0 0;}
				.price-list ul{width:523px;}
				.price-list li{float:left;margin-right:20px;line-height: 30px;font-size:14px;width: 160px;}
				.price-list li i{width:16px;height: 16px;display: inline-block;vertical-align: middle;margin-right: 5px;}
				.price-list li.tmall i{background: url(https://icon.zol-img.com.cn/ask/2017/mallentrance/pc_tmall.png) no-repeat;}
				.price-list li.jd i{background: url(https://icon.zol-img.com.cn/ask/2017/mallentrance/pc_jd.png) no-repeat;}
				.price-list li.amazon i{background: url(https://icon.zol-img.com.cn/ask/2017/mallentrance/pc_amazon.png) no-repeat;}
				.price-list li.zol i{background: url(https://icon.zol-img.com.cn/ask/2017/mallentrance/pc_zol.png) no-repeat;}
				.price-list li font{color:#f00;}
			</style>
			<c:forEach var="pi" items="${POSTSLIST }">
			<tr id="6_2_26967">
				<td class="folder">
					<span title="一级置顶" class="ico-atop"></span>
				</td>
				<td class="title " data-pic="" data-url="#">
					<div>
						<span class="iclass"></span>
						<a class="topicurl listbook" style="" target="_blank" href="#" title="${pi.postTitle }">${pi.postTitle }</a>
		            </div>
				</td>

				<td class="author">
		    		<a class="name" href="http://my.zol.com.cn/bbs/mnyadf30b0/" target="_blank">Z管儿</a>
		    		<span class="date">${pi.postDate }</span>
		    	</td>
    		
		    	<td class="reply">
		        	<span class="black">104</span>/
		        	<i class="max-num">12211</i>
		    	</td>
    		
		    	<td class="last-post">
		    		<a class="name" href="http://my.zol.com.cn/bbs/wenchchen/" target="_blank" title="">wenchchen</a>
		    		<a href="http://bbs.zol.com.cn/huodong/d2_26967_6.html#reply104" target="_blank" class="date">今天 10:54</a>
		    	</td>
			</tr>
			</c:forEach>
			

		</tbody>	
	</table>
	</div>
	<!-- 底部分页 开始 -->
	<div class="pgs pgs-foot clearfix">
		<div class="btn-div">
	    	<div class="publish-btn">
	    		<c:choose>
	    			<c:when test="${empty USERSINFO }">
	    				<a href="#" class="fb-btn-up border-radius-s3 cir_btn"><span>请登录后发帖</span></a>	
	    			</c:when>
	    			<c:otherwise>
	    				<a href="javascript:showPostModal()" target="_blank" class="fb-btn-up border-radius-s3 cir_btn"><span>发表新帖</span></a>	
	    			</c:otherwise>
	    		</c:choose>
    	            
    		</div>
		</div>
	<div class="page-go">
		<span>去第</span>
		<input class="text border-radius-s3" type="text" id="jumpUrlInput1" value="">
		<span>页</span>
		<a href="http://bbs.zol.com.cn/sjbbs/###" class="btn-blue border-radius-s3" id="jumpUrl1">确定</a>
	</div>
	<div class="page">
		<span class="current">1</span><a href="http://bbs.zol.com.cn/sjbbs/p2.html#c">2</a><a href="http://bbs.zol.com.cn/sjbbs/p3.html#c">3</a><span>...</span><a href="http://bbs.zol.com.cn/sjbbs/p500.html#c">500</a><a href="http://bbs.zol.com.cn/sjbbs/p2.html#c" class="next">下一页</a>	</div>
	</div>	
	<!-- 底部分页 结束 -->
	
	<br />
	<br />
	<br />
</div>
	
	
	
	
	
	
	
	<link href="bootstrap/bootstrap.min.css" rel="stylesheet"/>
	
	<script type="text/javascript" src="bootstrap/jquery.min.js"></script>
	<script type="text/javascript" src="bootstrap/bootstrap.min.js"></script>
	<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.3/summernote.css" rel="stylesheet">
	<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.3/summernote.js"></script>	

	

	<!--注册 模态框（Modal） -->
	<div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	        	<form action="user" method="post"  class="form-horizontal" role="form">
	            <input type="hidden" name="type" value="add"/>
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title" id="myModalLabel">注册新用户</h4>
	            </div>
	            <div class="modal-body">
	            	
	            	<div class="form-group">
					   <label for="firstname" class="col-sm-2 control-label">账号:</label>
					   <div class="col-sm-10">
					     <input type="text" class="form-control" placeholder="请输入账号" name="name" />
					   </div>
					</div>
	            	<div class="form-group">
					   <label for="firstname" class="col-sm-2 control-label">密码:</label>
					   <div class="col-sm-10">
					     <input type="password" class="form-control" placeholder="请输入密码" name="pass" />
					   </div>
					</div>
					<div class="form-group">
					   <label for="firstname" class="col-sm-2 control-label">昵称:</label>
					   <div class="col-sm-10">
					     <input type="text" class="form-control" placeholder="请输入昵称" name="nickname" />
					   </div>
					</div>
	            	<div class="form-group">
					   <label for="firstname" class="col-sm-2 control-label">城市:</label>
					   <div class="col-sm-10">
					     <input type="text" class="form-control" placeholder="请输入城市" name="city" />
					   </div>
					</div>
	            </div>
	            <div class="modal-footer">
	                <input type="submit" class="btn btn-primary" value="注册新用户"/>
	            </div>
	            </form>
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal -->
	</div>

	<!--登录 模态框（Modal） -->
	<div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	        	<form action="user" method="post"  class="form-horizontal" role="form">
	            <input type="hidden" name="type" value="login"/>
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title" id="myModalLabel">用户登录</h4>
	            </div>
	            <div class="modal-body">
	            	
	            	<div class="form-group">
					   <label for="firstname" class="col-sm-2 control-label">账号:</label>
					   <div class="col-sm-10">
					     <input type="text" class="form-control" placeholder="请输入账号" name="name" />
					   </div>
					</div>
	            	<div class="form-group">
					   <label for="firstname" class="col-sm-2 control-label">密码:</label>
					   <div class="col-sm-10">
					     <input type="password" class="form-control" placeholder="请输入密码" name="pass" />
					   </div>
					</div>
					
	            </div>
	            <div class="modal-footer">
	                <input type="submit" class="btn btn-primary" value="用户登录"/>
	            </div>
	            </form>
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal -->
	</div>


	<!--发帖 模态框（Modal） -->
	<div class="modal fade" id="postModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog" style="width:860px;">
	        <div class="modal-content">
	        	<form action="post" method="post"  class="form-horizontal" role="form">
	            <input type="hidden" name="type" value="add"/>
	            <input type="hidden" name="id" value="1"  />
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title" id="myModalLabel">发表新帖</h4>
	            </div>
	            <div class="modal-body">
	            	
	            	<div class="form-group">
					   <div class="col-sm-10">
					     <input type="text" class="form-control" placeholder="请输入标题" name="title" />
					   </div>
					</div>
	            	<div class="form-group">
					   <div class="col-sm-10">
					     <textarea id="summernote" name="content">
					     </textarea>
					   </div>
					</div>
					
	            </div>
	            <div class="modal-footer">
	                <input type="submit" class="btn btn-primary" value="发帖"/>
	            </div>
	            </form>
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal -->
	</div>
	<script>
		$(document).ready(function() {
			//将编号为summernote的样式设置成summernote
			$('#summernote').summernote();
		});
	</script>

</body>

</html>
