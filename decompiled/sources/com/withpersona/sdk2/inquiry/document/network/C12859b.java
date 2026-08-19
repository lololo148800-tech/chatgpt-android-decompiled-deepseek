package com.withpersona.sdk2.inquiry.document.network;

import bj.C11447L;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import dj.AbstractC13178c;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mo.AbstractC17329F;
import p025An.C0583L;
import p026Ao.InterfaceC0677k;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1044uj.C20336g;
import p1044uj.C20338h;
import p1087wj.C20990k;
import p1087wj.C20991l;
import p1087wj.C20993n;
import p1087wj.C21001v;
import p185H6.C3246b;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C12859b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public NetworkCallResult.Success f40600Y;

    /* JADX INFO: renamed from: Z */
    public int f40601Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f40602o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0583L f40603p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C21001v f40604q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12859b(C0583L c0583l, C21001v c21001v, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f40603p0 = c0583l;
        this.f40604q0 = c21001v;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C12859b c12859b = new C12859b(this.f40603p0, this.f40604q0, interfaceC18770c);
        c12859b.f40602o0 = obj;
        return c12859b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C12859b) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0168 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0169  */
    /* JADX WARN: Code duplicated, block: B:56:0x017b A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2186j interfaceC2186j;
        Object obj2;
        DocumentFileUploadResponse documentFileUploadResponse;
        DocumentFileData.RemoteDocumentFile remoteDocumentFile;
        C20990k c20990k;
        DocumentFileData.Attributes attributes;
        List list;
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo;
        C20991l c20991l;
        C20990k c20990k2;
        GenericFileUploadErrorResponse genericFileUploadErrorResponse;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        switch (this.f40601Z) {
            case 0:
                AbstractC9233X.m9807c(obj);
                InterfaceC2186j interfaceC2186j2 = (InterfaceC2186j) this.f40602o0;
                this.f40602o0 = interfaceC2186j2;
                this.f40601Z = 1;
                Object objM1309u = this.f40603p0.m1309u(this);
                if (objM1309u == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC2186j = interfaceC2186j2;
                obj = objM1309u;
                obj2 = (NetworkCallResult) obj;
                if (obj2 instanceof NetworkCallResult.Success) {
                    documentFileUploadResponse = (DocumentFileUploadResponse) ((NetworkCallResult.Success) obj2).getResponse();
                    if (documentFileUploadResponse != null || (attributes = documentFileUploadResponse.f40580a.f40569b) == null || (list = attributes.f40570a) == null) {
                        remoteDocumentFile = null;
                    } else {
                        remoteDocumentFile = (DocumentFileData.RemoteDocumentFile) AbstractC17680n.m19343S(list);
                    }
                    if (documentFileUploadResponse != null || remoteDocumentFile == null) {
                        c20990k = new C20990k(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                        this.f40602o0 = interfaceC2186j;
                        this.f40600Y = (NetworkCallResult.Success) obj2;
                        this.f40601Z = 3;
                        if (interfaceC2186j.mo395a(c20990k, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        C20336g c20336g = this.f40604q0.f66847e;
                        C20993n c20993n = new C20993n(c20336g, new C20338h(c20336g.f64301Y, remoteDocumentFile.f40572b, remoteDocumentFile.f40571a, documentFileUploadResponse.f40580a.f40568a));
                        this.f40602o0 = interfaceC2186j;
                        this.f40600Y = (NetworkCallResult.Success) obj2;
                        this.f40601Z = 2;
                        if (interfaceC2186j.mo395a(c20993n, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
                if (obj2 instanceof NetworkCallResult.Failure) {
                    networkErrorInfo = ((NetworkCallResult.Failure) obj2).getNetworkErrorInfo();
                    if (!networkErrorInfo.isRecoverable() && (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.UnknownError)) {
                        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
                        AbstractC16544l.m18092e(responseError, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.ErrorResponse.Error.UnknownError");
                        AbstractC17329F errorBody = ((ErrorResponse.Error.UnknownError) responseError).getErrorBody();
                        if (errorBody != null) {
                            try {
                                InterfaceC0677k interfaceC0677kMo18988O0 = errorBody.mo18988O0();
                                C3246b c3246b = new C3246b();
                                c3246b.m4134a(GenericFileUploadErrorResponse.INSTANCE.getAdapter());
                                genericFileUploadErrorResponse = (GenericFileUploadErrorResponse) new C11447L(c3246b).m12850b(GenericFileUploadErrorResponse.class, AbstractC13178c.f41820a, null).fromJson(interfaceC0677kMo18988O0);
                            } catch (Exception unused) {
                                genericFileUploadErrorResponse = null;
                            }
                        } else {
                            genericFileUploadErrorResponse = null;
                        }
                        if (genericFileUploadErrorResponse != null) {
                            C20990k c20990k3 = new C20990k(genericFileUploadErrorResponse.getErrors().get(0));
                            this.f40602o0 = obj2;
                            this.f40600Y = null;
                            this.f40601Z = 4;
                            if (interfaceC2186j.mo395a(c20990k3, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        } else {
                            C20990k c20990k4 = new C20990k(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                            this.f40602o0 = obj2;
                            this.f40600Y = null;
                            this.f40601Z = 5;
                            if (interfaceC2186j.mo395a(c20990k4, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else if (networkErrorInfo.isRecoverable()) {
                        c20990k2 = new C20990k(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                        this.f40602o0 = obj2;
                        this.f40600Y = null;
                        this.f40601Z = 6;
                        if (interfaceC2186j.mo395a(c20990k2, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        c20991l = new C20991l(networkErrorInfo);
                        this.f40602o0 = obj2;
                        this.f40600Y = null;
                        this.f40601Z = 7;
                        if (interfaceC2186j.mo395a(c20991l, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
                return C17296C.f55119a;
            case 1:
                InterfaceC2186j interfaceC2186j3 = (InterfaceC2186j) this.f40602o0;
                AbstractC9233X.m9807c(obj);
                interfaceC2186j = interfaceC2186j3;
                obj2 = (NetworkCallResult) obj;
                if (obj2 instanceof NetworkCallResult.Success) {
                    documentFileUploadResponse = (DocumentFileUploadResponse) ((NetworkCallResult.Success) obj2).getResponse();
                    if (documentFileUploadResponse != null) {
                        remoteDocumentFile = null;
                    } else {
                        remoteDocumentFile = null;
                    }
                    if (documentFileUploadResponse != null) {
                        c20990k = new C20990k(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                        this.f40602o0 = interfaceC2186j;
                        this.f40600Y = (NetworkCallResult.Success) obj2;
                        this.f40601Z = 3;
                        if (interfaceC2186j.mo395a(c20990k, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        c20990k = new C20990k(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                        this.f40602o0 = interfaceC2186j;
                        this.f40600Y = (NetworkCallResult.Success) obj2;
                        this.f40601Z = 3;
                        if (interfaceC2186j.mo395a(c20990k, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
                if (obj2 instanceof NetworkCallResult.Failure) {
                    networkErrorInfo = ((NetworkCallResult.Failure) obj2).getNetworkErrorInfo();
                    if (!networkErrorInfo.isRecoverable()) {
                        if (networkErrorInfo.isRecoverable()) {
                            c20990k2 = new C20990k(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                            this.f40602o0 = obj2;
                            this.f40600Y = null;
                            this.f40601Z = 6;
                            if (interfaceC2186j.mo395a(c20990k2, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        } else {
                            c20991l = new C20991l(networkErrorInfo);
                            this.f40602o0 = obj2;
                            this.f40600Y = null;
                            this.f40601Z = 7;
                            if (interfaceC2186j.mo395a(c20991l, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else if (networkErrorInfo.isRecoverable()) {
                        c20990k2 = new C20990k(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                        this.f40602o0 = obj2;
                        this.f40600Y = null;
                        this.f40601Z = 6;
                        if (interfaceC2186j.mo395a(c20990k2, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        c20991l = new C20991l(networkErrorInfo);
                        this.f40602o0 = obj2;
                        this.f40600Y = null;
                        this.f40601Z = 7;
                        if (interfaceC2186j.mo395a(c20991l, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
                return C17296C.f55119a;
            case 2:
            case 3:
                obj2 = this.f40600Y;
                interfaceC2186j = (InterfaceC2186j) this.f40602o0;
                AbstractC9233X.m9807c(obj);
                if (obj2 instanceof NetworkCallResult.Failure) {
                    networkErrorInfo = ((NetworkCallResult.Failure) obj2).getNetworkErrorInfo();
                    if (!networkErrorInfo.isRecoverable()) {
                        if (networkErrorInfo.isRecoverable()) {
                            c20990k2 = new C20990k(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                            this.f40602o0 = obj2;
                            this.f40600Y = null;
                            this.f40601Z = 6;
                            if (interfaceC2186j.mo395a(c20990k2, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        } else {
                            c20991l = new C20991l(networkErrorInfo);
                            this.f40602o0 = obj2;
                            this.f40600Y = null;
                            this.f40601Z = 7;
                            if (interfaceC2186j.mo395a(c20991l, this) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else if (networkErrorInfo.isRecoverable()) {
                        c20990k2 = new C20990k(new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(null, null, null, 7, null));
                        this.f40602o0 = obj2;
                        this.f40600Y = null;
                        this.f40601Z = 6;
                        if (interfaceC2186j.mo395a(c20990k2, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        c20991l = new C20991l(networkErrorInfo);
                        this.f40602o0 = obj2;
                        this.f40600Y = null;
                        this.f40601Z = 7;
                        if (interfaceC2186j.mo395a(c20991l, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
                return C17296C.f55119a;
            case 4:
            case 5:
            case 6:
            case 7:
                AbstractC9233X.m9807c(obj);
                return C17296C.f55119a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
