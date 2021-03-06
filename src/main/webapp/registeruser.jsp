<jsp:include page="metas.jsp" />
<%@ taglib uri="WEB-INF/CustomTags.tld" prefix="add" %> 
<%
    //add user
    if (request.getParameter("username") != null && request.getParameter("password") != null && request.getParameter("first_name") != null && request.getParameter("last_name") != null && request.getParameter("email") != null && request.getParameter("role") != null) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String role = request.getParameter("role");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String healthcentre = request.getParameter("healthcentre");
%>
<add:RegisterUser u="<%=username%>" p="<%=password%>" e="<%=email %>" r="<%=role %>" f="<%=first_name%>" l="<%=last_name %>" h="<%=healthcentre %>" />
<%
    }
%>

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
                    <div class="ms-auto text-end">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="#">Home</a></li>
                                <li class="breadcrumb-item active" aria-current="page">
                                    Users/Register user
                                </li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid border-top border-secondary">
            <div>
                <!-- Form -->
                <form class="form-horizontal mt-3" action="registeruser" method="post">
                    <div class="row pb-4">
                        <div class="col-12">
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span
                                        class="input-group-text bg-success text-white h-100"
                                        id="basic-addon1"
                                        ><i class="mdi mdi-account fs-4"></i
                                        ></span>
                                </div>
                                <input
                                    type="text"
                                    class="form-control form-control-lg"
                                    placeholder="Username"
                                    aria-label="Username"
                                    aria-describedby="basic-addon1"
                                    name="username"
                                    required
                                    />
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span
                                        class="input-group-text bg-success text-white h-100"
                                        id="basic-addon1"
                                        ><i class="mdi mdi-account fs-4"></i
                                        ></span>
                                </div>
                                <input
                                    type="text"
                                    class="form-control form-control-lg"
                                    placeholder="First Name"
                                    aria-label="First Name"
                                    aria-describedby="basic-addon1"
                                    name="first_name"
                                    required
                                    />
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span
                                        class="input-group-text bg-success text-white h-100"
                                        id="basic-addon1"
                                        ><i class="mdi mdi-account fs-4"></i
                                        ></span>
                                </div>
                                <input
                                    type="text"
                                    class="form-control form-control-lg"
                                    placeholder="Last Name"
                                    aria-label="Last Name"
                                    aria-describedby="basic-addon1"
                                    name="last_name"
                                    required
                                    />
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span
                                        class="input-group-text bg-success text-white h-100"
                                        id="basic-addon1"
                                        ><i class="mdi mdi-account fs-4"></i
                                        ></span>
                                </div>
                                <input
                                    type="text"
                                    class="form-control form-control-lg"
                                    placeholder="Password"
                                    aria-label="password"
                                    aria-describedby="basic-addon1"
                                    name="password"
                                    required
                                    />
                            </div>
                            <!-- email -->
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span
                                        class="input-group-text bg-danger text-white h-100"
                                        id="basic-addon1"
                                        ><i class="mdi mdi-email fs-4"></i
                                        ></span>
                                </div>
                                <input
                                    type="text"
                                    class="form-control form-control-lg"
                                    placeholder="Health Center"
                                    aria-label="healthCenter"
                                    aria-describedby="basic-addon1"
                                    name="healthcentre"
                                    required
                                    />
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span
                                        class="input-group-text bg-warning text-white h-100"
                                        id="basic-addon2"
                                        ><i class="mdi mdi-lock fs-4"></i
                                        ></span>
                                </div>
                                <input
                                    type="text"
                                    class="form-control form-control-lg"
                                    placeholder="Email"
                                    aria-label="Email"
                                    aria-describedby="basic-addon1"
                                    required
                                    name="email"
                                    />
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span
                                        class="input-group-text bg-success text-white h-100"
                                        id="basic-addon1"
                                        ><i class="mdi mdi-account fs-4"></i
                                        ></span>
                                </div>
                                <input
                                    type="text"
                                    class="form-control form-control-lg"
                                    placeholder="Role"
                                    aria-label="Role"
                                    aria-describedby="basic-addon1"
                                    name="role"
                                    required
                                    />
                            </div>
                            <div class="row border-top border-secondary">
                                <div class="col-12">
                                    <div class="form-group">
                                        <div class="pt-3 d-grid">
                                            <button
                                                class="btn btn-block btn-lg btn-info"
                                                type="submit"
                                                >
                                                Register User
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>
                    <!-- ============================================================== -->
                    <!-- End Bread crumb and right sidebar toggle -->
                    <!-- ============================================================== -->
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
    <jsp:include page="bottommeta.jsp" />
