// 引入依赖包
var
    gulp = require('gulp'),
    sass = require('gulp-ruby-sass'),
    prefix = require('gulp-autoprefixer')
;


// 编译Sass
var sourceFile = 'css/_sass/index.scss';
gulp.task('sass', function() {
    return sass([sourceFile],{style: 'expanded'})
    .on('error', function (err) {
      console.error('Error!', err.message);
    })
    .pipe(prefix('ios 6', 'android  4'))
    .pipe(gulp.dest('css'));
});

gulp.task('watch', function() {
    gulp.watch(sourceFile, ['sass']);
});

gulp.task('default', ['watch', 'sass']);