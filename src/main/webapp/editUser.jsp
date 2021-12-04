<jsp:include page="metas.jsp" />
<%@ taglib uri="WEB-INF/CustomTags.tld" prefix="m" %>
 <%
            //prevent back button after logout
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            //check session
            if (session.getAttribute("start") == null) {
                response.sendRedirect("authentication-login");
            }
        %>
<%
            //update user
            if (request.getParameter("update_username") != null) {
                String username = request.getParameter("username");
                String first_name = request.getParameter("first_name");
                String last_name = request.getParameter("last_name");
                String password = request.getParameter("password");
                String healthcentre = request.getParameter("healthcentre");
                String email = request.getParameter("email");
                String role = request.getParameter("role");
                String uid = request.getParameter("update_username");
        %>
        <m:UpdateUser u="<%=username%>" p="<%=password%>" f="<%=first_name%>" l="<%=last_name %>" h="<%=healthcentre%>" e="<%=email%>" r="<%=role%>" uid="<%=uid%>" />
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
                                    Users/Update User
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
                <form class="form-horizontal mt-3" action="updateUser" method="post">
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
                                    value="<m:SelectSingleTag username='<%=request.getParameter("update_username") %>' field='username' />"
                                    
                                    />
                            </div>
                            <div class="input-group mb-3">
<!--                                <div class="input-group-prepend">
                                    <span
                                        class="input-group-text bg-success text-white h-100"
                                        id="basic-addon1"
                                        ><i class="mdi mdi-account fs-4"></i
                                        ></span>
                                </div>-->
                                <input
                                    type="hidden"
                                    class="form-control form-control-lg"
                                    placeholder="update_username"
                                    aria-label="Update_username"
                                    aria-describedby="basic-addon1"
                                    name="update_username"
                                    value="@wilberforceking"
                                    
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
                                                Update Record
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
