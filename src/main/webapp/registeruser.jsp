
<!DOCTYPE html>
<html dir="ltr" lang="en">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta
      name="keywords"
      content="wrappixel, admin dashboard, html css dashboard, web dashboard, bootstrap 5 admin, bootstrap 5, css3 dashboard, bootstrap 5 dashboard, Matrix lite admin bootstrap 5 dashboard, frontend, responsive bootstrap 5 admin template, Matrix admin lite design, Matrix admin lite dashboard bootstrap 5 dashboard template"
    />
    <meta
      name="description"
      content="Matrix Admin Lite Free Version is powerful and clean admin dashboard template, inpired from Bootstrap Framework"
    />
    <meta name="robots" content="noindex,nofollow" />
    <title>Vaccine Administration Tracker</title>
    <!-- Favicon icon -->
    <link
      rel="icon"
      type="image/png"
      sizes="16x16"
      href="assets/images/favicon.png"
    />
    <!-- Custom CSS -->
    <link
      href="assets/libs/jquery-steps/jquery.steps.css"
      rel="stylesheet"
    />
    <link href="assets/libs/jquery-steps/steps.css" rel="stylesheet" />
    <link href="dist/css/style.min.css" rel="stylesheet" />
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
    <!-- ============================================================== -->
    <!-- Preloader - style you can find in spinners.css -->
    <!-- ============================================================== -->
    <div class="preloader">
      <div class="lds-ripple">
        <div class="lds-pos"></div>
        <div class="lds-pos"></div>
      </div>
    </div>
    <!-- ============================================================== -->
    <!-- Main wrapper - style you can find in pages.scss -->
    <!-- ============================================================== -->
    <div
      id="main-wrapper"
      data-layout="vertical"
      data-navbarbg="skin5"
      data-sidebartype="full"
      data-sidebar-position="absolute"
      data-header-position="absolute"
      data-boxed-layout="full"
    >
      <!-- ============================================================== -->
      <!-- Topbar header - style you can find in pages.scss -->
      <!-- ============================================================== -->
      
      
      
      
      
      
      
      
      
 <jsp:include page="topdiv.jsp" />
      <!-- ============================================================== -->
      <!-- End Left Sidebar - style you can find in sidebar.scss  -->
      <!-- ============================================================== -->
      <!-- ============================================================== -->
      <!-- Page wrapper  -->
      <!-- ============================================================== -->
      <div class="page-wrapper">
        <!-- ============================================================== -->
        <!-- Bread crumb and right sidebar toggle -->
        <!-- ============================================================== -->
        <div class="page-breadcrumb">
          <div class="row">
            <div class="col-12 d-flex no-block align-items-center">
              <h4 class="page-title">System Administration</h4>
              <div class="ms-auto text-end">
                <nav aria-label="breadcrumb">
                  <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                    <li class="breadcrumb-item active" aria-current="page">
                      System Administration
                    </li>
                  </ol>
                </nav>
              </div>
            </div>
          </div>
        </div>
        <!-- ============================================================== -->
        <!-- End Bread crumb and right sidebar toggle -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- Container fluid  -->
        <!-- ============================================================== -->
        <div class="container-fluid">
          <!-- ============================================================== -->
          <!-- Start Page Content -->
          <!-- ============================================================== -->
          <div class="card">
            <div class="card-body wizard-content">
              <h4 class="card-title">Add a User</h4>
              <h6 class="card-subtitle"></h6>
              <form id="example-form" action="registeruser.jsp" class="mt-5">
                <div>
                  <h3>Account</h3>
                  <section>
                    <label for="username">User name *</label>
                    <input
                      id="username"
                      name="username"
                      type="text"
                      class="required form-control"
                    />
                    <label for="role">Role *</label>
                    <input
                      id="role"
                      name="role"
                      type="text"
                      class="required form-control"
                    />
                    <label for="password">Password *</label>
                    <input
                      id="password"
                      name="password"
                      type="password"
                      class="required form-control"
                    />
                    <label for="confirm">Confirm Password *</label>
                    <input
                      id="confirm"
                      name="confirm"
                      type="password"
                      class="required form-control"
                    />
                    <p>(*) Mandatory</p>
                  </section>
                  <h3>Profile</h3>
                  <section>
                    <label for="name">First name *</label>
                    <input
                      id="name"
                      name="name"
                      type="text"
                      class="required form-control"
                    />
                    <label for="surname">Last name *</label>
                    <input
                      id="surname"
                      name="surname"
                      type="text"
                      class="required form-control"
                    />
                    <label for="email">Email *</label>
                    <input
                      id="email"
                      name="email"
                      type="text"
                      class="required email form-control"
                    />
                    <label for="healthcentre">Health Centre</label>
                    <input
                      id="healthcentre"
                      name="healthcentre"
                      type="text"
                      class="form-control"
                    />
                    <p>(*) Mandatory</p>
                  </section>
                  <h3>Finish</h3>
                  <section>
                    <input
                      id="acceptTerms"
                      name="acceptTerms"
                      type="checkbox"
                      class="required"
                    />
                    <label for="acceptTerms"
                      >The information entered is valid and confirmed</label
                    >
                    <button type="button" class="btn btn-success btn-lg text-white">
                      Success
                    </button>
                  </section>
                </div>
              </form>
            </div>
          </div>
          <!-- ============================================================== -->
          <!-- End PAge Content -->
          <!-- ============================================================== -->
          <!-- ============================================================== -->
          <!-- Right sidebar -->
          <!-- ============================================================== -->
          <!-- .right-sidebar -->
          <!-- ============================================================== -->
          <!-- End Right sidebar -->
          <!-- ============================================================== -->
        </div>
        <!-- ============================================================== -->
        <!-- End Container fluid  -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- footer -->
        <!-- ============================================================== -->
        <footer class="footer text-center">
          Vaccine Administration Tracker
        </footer>
        <!-- ============================================================== -->
        <!-- End footer -->
        <!-- ============================================================== -->
      </div>
      <!-- ============================================================== -->
      <!-- End Page wrapper  -->
      <!-- ============================================================== -->
    </div>
    <!-- ============================================================== -->
    <!-- End Wrapper -->
    <!-- ============================================================== -->
    <!-- ============================================================== -->
    <!-- All Jquery -->
    <!-- ============================================================== -->
    <script src="assets/libs/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap tether Core JavaScript -->
    <script src="assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
    <!-- slimscrollbar scrollbar JavaScript -->
    <script src="assets/libs/perfect-scrollbar/dist/perfect-scrollbar.jquery.min.js"></script>
    <script src="assets/extra-libs/sparkline/sparkline.js"></script>
    <!--Wave Effects -->
    <script src="dist/js/waves.js"></script>
    <!--Menu sidebar -->
    <script src="dist/js/sidebarmenu.js"></script>
    <!--Custom JavaScript -->
    <script src="dist/js/custom.min.js"></script>
    <!-- this page js -->
    <script src="assets/libs/jquery-steps/build/jquery.steps.min.js"></script>
    <script src="assets/libs/jquery-validation/dist/jquery.validate.min.js"></script>
    <script>
      // Basic Example with form
      var form = $("#example-form");
      form.validate({
        errorPlacement: function errorPlacement(error, element) {
          element.before(error);
        },
        rules: {
          confirm: {
            equalTo: "#password"
          }
        }
      });
      form.children("div").steps({
        headerTag: "h3",
        bodyTag: "section",
        transitionEffect: "slideLeft",
        onStepChanging: function (event, currentIndex, newIndex) {
          form.validate().settings.ignore = ":disabled,:hidden";
          return form.valid();
        },
        onFinishing: function (event, currentIndex) {
          form.validate().settings.ignore = ":disabled";
          return form.valid();
        }
//        onFinished: function (event, currentIndex) {
//          alert("Submitted!");
//        },
      });
    </script>
  </body>
</html>
