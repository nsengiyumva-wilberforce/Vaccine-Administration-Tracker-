<jsp:include page="metas.jsp" />
<%@ taglib uri="WEB-INF/CustomTags.tld" prefix="add" %> 
<%
    //add user
    if (request.getParameter("person") != null && request.getParameter("healthcentre") != null && request.getParameter("vaccine") != null && request.getParameter("date") != null && request.getParameter("time") != null) {
        String person = request.getParameter("person");
        String healthcentre = request.getParameter("healthcentre");
        String vaccine = request.getParameter("vaccine");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        
%>
<add:addbooking person="<%=person%>" healthcentre="<%=healthcentre%>" vaccine="<%=vaccine %>" date="<%=date %>" time="<%=time%>" />

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
                                    Booking Module
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
                <form class="form-horizontal mt-3" action="book" method="post">
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
                                    placeholder="person"
                                    aria-label="person"
                                    aria-describedby="basic-addon1"
                                    name="person"
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
                                    placeholder="healthcentre"
                                    aria-label="healthcentre"
                                    aria-describedby="basic-addon1"
                                    name="healthcentre"
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
                                    placeholder="vaccine"
                                    aria-label="vaccine"
                                    aria-describedby="basic-addon1"
                                    name="vaccine"
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
                                    type="date"
                                    class="form-control form-control-lg"
                                    placeholder="date"
                                    aria-label="date"
                                    aria-describedby="basic-addon1"
                                    name="date"
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
                                    type="time"
                                    class="form-control form-control-lg"
                                    placeholder="time"
                                    aria-label="time"
                                    aria-describedby="basic-addon1"
                                    name="time"
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
                                                Book Now
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