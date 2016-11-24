<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">
html,
body {
  height: 100%;
  min-height: 450px;
  font-family: 'Dosis', sans-serif;
  font-size: 32px;
  font-weight: 500;
  color: #5d7399;
}

.content {
  height: 100%;
  position: relative;
  z-index: 1;
  background-color: #d2e1ec;
  background-image: -webkit-linear-gradient(top, #bbcfe1 0%, #e8f2f6 80%);
  background-image: linear-gradient(to bottom, #bbcfe1 0%, #e8f2f6 80%);
  overflow: hidden;
}

.snow {
  position: absolute;
  top: 0;
  left: 0;
  pointer-events: none;
  z-index: 20;
}

.main-text {
  padding: 20vh 20px 0 20px;
  text-align: center;
  line-height: 2em;
  font-size: 5vh;
}

.home-link {
  font-size: 0.6em;
  font-weight: 400;
  color: inherit;
  text-decoration: none;
  opacity: 0.6;
  border-bottom: 1px dashed rgba(93, 115, 153, 0.5);
}
.home-link:hover {
  opacity: 1;
}

.ground {
  height: 160px;
  width: 100%;
  position: absolute;
  bottom: 0;
  left: 0;
  background: #f6f9fa;
  box-shadow: 0 0 10px 10px #f6f9fa;
}
.ground:before, .ground:after {
  content: '';
  display: block;
  width: 250px;
  height: 250px;
  position: absolute;
  top: -62.5px;
  z-index: -1;
  background: transparent;
  -webkit-transform: scaleX(0.2) rotate(45deg);
          transform: scaleX(0.2) rotate(45deg);
}
.ground:after {
  left: 50%;
  margin-left: -166.66667px;
  box-shadow: -345px 255px 15px #adb9cd, -625px 575px 15px #8798b6, -905px 895px 15px #8496b4, -1225px 1175px 15px #91a1bc, -1480px 1520px 15px #8496b4, -1760px 1840px 15px #b0bccf, -2055px 2145px 15px #b0bccf, -2385px 2415px 15px #8798b6, -2675px 2725px 15px #bac4d5, -3020px 2980px 15px #97a6c0, -3250px 3350px 15px #a1aec6, -3610px 3590px 15px #a1aec6, -3890px 3910px 15px #94a3be, -4200px 4200px 15px #8496b4, -4505px 4495px 15px #9dabc4, -4765px 4835px 15px #91a1bc;
}
.ground:before {
  right: 50%;
  margin-right: -166.66667px;
  box-shadow: 305px -295px 15px #bac4d5, 595px -605px 15px #8e9eba, 875px -925px 15px #8496b4, 1230px -1170px 15px #b7c1d3, 1520px -1480px 15px #8798b6, 1805px -1795px 15px #b7c1d3, 2135px -2065px 15px #94a3be, 2380px -2420px 15px #a4b1c8, 2735px -2665px 15px #b7c1d3, 3025px -2975px 15px #8798b6, 3290px -3310px 15px #7e90b0, 3590px -3610px 15px #a4b1c8, 3935px -3865px 15px #8496b4, 4215px -4185px 15px #9aa9c2, 4535px -4465px 15px #8496b4, 4840px -4760px 15px #b0bccf;
}

.mound {
  margin-top: -80px;
  font-weight: 800;
  font-size: 180px;
  text-align: center;
  color: #dd4040;
  pointer-events: none;
}
.mound:before {
  content: '';
  display: block;
  width: 600px;
  height: 200px;
  position: absolute;
  left: 50%;
  margin-left: -300px;
  top: 50px;
  z-index: 1;
  border-radius: 100%;
  background-color: #e8f2f6;
  background-image: -webkit-linear-gradient(top, #dee8f1, #f6f9fa 60px);
  background-image: linear-gradient(to bottom, #dee8f1, #f6f9fa 60px);
}
.mound:after {
  content: '';
  display: block;
  width: 28px;
  height: 6px;
  position: absolute;
  left: 50%;
  margin-left: -150px;
  top: 68px;
  z-index: 2;
  background: #dd4040;
  border-radius: 100%;
  -webkit-transform: rotate(-15deg);
          transform: rotate(-15deg);
  box-shadow: -56px 12px 0 1px #dd4040, -126px 6px 0 2px #dd4040, -196px 24px 0 3px #dd4040;
}

.mound_text {
  -webkit-transform: rotate(6deg);
          transform: rotate(6deg);
}

.mound_spade {
  display: block;
  width: 35px;
  height: 30px;
  position: absolute;
  right: 50%;
  top: 42%;
  margin-right: -250px;
  z-index: 0;
  -webkit-transform: rotate(35deg);
          transform: rotate(35deg);
  background: #dd4040;
}
.mound_spade:before, .mound_spade:after {
  content: '';
  display: block;
  position: absolute;
}
.mound_spade:before {
  width: 40%;
  height: 30px;
  bottom: 98%;
  left: 50%;
  margin-left: -20%;
  background: #dd4040;
}
.mound_spade:after {
  width: 100%;
  height: 30px;
  top: -55px;
  left: 0%;
  box-sizing: border-box;
  border: 10px solid #dd4040;
  border-radius: 4px 4px 20px 20px;
}

</style>
</head>
<body class = "com">
<div class="content">
  <canvas id="snow" class="snow"></canvas>
  <div class="main-text">
    <h1>Aw jeez.<br/>That page has gone missing.</h1><a href="javascript:history.go(-1)" class="home-link">Hitch a ride back home.</a>
  </div>
  <div class="ground">
    <div class="mound"> 
      <div class="mound_text">404</div>
      <div class="mound_spade"></div>
    </div>
  </div>
</div>
</body>
<script type="text/javascript">
(function() {
	function ready(fn) {
		if (document.readyState != 'loading') {
			fn();
		} else {
			document.addEventListener('DOMContentLoaded', fn);
		}
	}

	function makeSnow(el) {
		var ctx = el.getContext('2d');
		var width = 0;
		var height = 0;
		var particles = [];

		var Particle = function() {
			this.x = this.y = this.dx = this.dy = 0;
			this.reset();
		}

		Particle.prototype.reset = function() {
			this.y = Math.random() * height;
			this.x = Math.random() * width;
			this.dx = (Math.random() * 1) - 0.5;
			this.dy = (Math.random() * 0.5) + 0.5;
		}

		function createParticles(count) {
			if (count != particles.length) {
				particles = [];
				for (var i = 0; i < count; i++) {
					particles.push(new Particle());
				}
			}
		}

		function onResize() {
			width = window.innerWidth;
			height = window.innerHeight;
			el.width = width;
			el.height = height;

			createParticles((width * height) / 10000);
		}

		function updateParticles() {
			ctx.clearRect(0, 0, width, height);
			ctx.fillStyle = '#f6f9fa';

			particles.forEach(function(particle) {
				particle.y += particle.dy;
				particle.x += particle.dx;

				if (particle.y > height) {
					particle.y = 0;
				}

				if (particle.x > width) {
					particle.reset();
					particle.y = 0;
				}

				ctx.beginPath();
				ctx.arc(particle.x, particle.y, 5, 0, Math.PI * 2, false);
				ctx.fill();
			});

			window.requestAnimationFrame(updateParticles);
		}

		onResize();
		updateParticles();

		window.addEventListener('resize', onResize);
	}

	ready(function() {
		var canvas = document.getElementById('snow');
		makeSnow(canvas);
	});
})();
</script>
</html>