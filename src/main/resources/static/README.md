#安装 gulp
npm install gulp

# 安装gulp依赖包
npm install gulp-ruby-sass
npm install gulp-autoprefixer

# 实时刷新工具
http://www.browsersync.cn/
npm install -g browser-sync



#执行一下两个命令
gulp

browser-sync start --server --files "css/*.css,js/*.js,html/*.html, lib/*/js/*.js,lib/*/css/*.css,"