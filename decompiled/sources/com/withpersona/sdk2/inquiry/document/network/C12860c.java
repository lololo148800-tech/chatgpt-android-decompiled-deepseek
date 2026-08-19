package com.withpersona.sdk2.inquiry.document.network;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import java.util.ArrayList;
import java.util.List;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1044uj.C20338h;
import p1087wj.C20970A;
import p1087wj.C21002w;
import p1087wj.C21003x;
import p1087wj.C21005z;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C12860c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public NetworkCallResult.Success f40605Y;

    /* JADX INFO: renamed from: Z */
    public int f40606Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f40607o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20970A f40608p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12860c(C20970A c20970a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f40608p0 = c20970a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C12860c c12860c = new C12860c(this.f40608p0, interfaceC18770c);
        c12860c.f40607o0 = obj;
        return c12860c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C12860c) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [nm.w] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        Object objEnqueueRetriableRequestWithRetry;
        NetworkCallResult networkCallResult;
        InterfaceC2186j interfaceC2186j2;
        NetworkCallResult networkCallResult2;
        ?? arrayList;
        List list;
        DocumentFileData.RemoteDocumentFile remoteDocumentFile;
        C21002w c21002w;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40606Z;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f40607o0;
                AbstractC9233X.m9807c(obj);
                objEnqueueRetriableRequestWithRetry = obj;
            } else if (i10 == 2 || i10 == 3) {
                networkCallResult2 = this.f40605Y;
                interfaceC2186j2 = (InterfaceC2186j) this.f40607o0;
                AbstractC9233X.m9807c(obj);
                networkCallResult = networkCallResult2;
                interfaceC2186j = interfaceC2186j2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    c21002w = new C21002w(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.f40607o0 = networkCallResult;
                    this.f40605Y = null;
                    this.f40606Z = 4;
                    if (interfaceC2186j.mo395a(c21002w, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f40607o0;
        C21005z c21005z = new C21005z(this.f40608p0, null);
        this.f40607o0 = interfaceC2186j;
        this.f40606Z = 1;
        objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c21005z, this);
        if (objEnqueueRetriableRequestWithRetry == enumC19250a) {
            return enumC19250a;
        }
        networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            CreateDocumentResponse createDocumentResponse = (CreateDocumentResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
            if (createDocumentResponse != null) {
                List<DocumentFileData> list2 = createDocumentResponse.f40561b;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (DocumentFileData documentFileData : list2) {
                        DocumentFileData.Attributes attributes = documentFileData.f40569b;
                        C20338h c20338h = (attributes == null || (list = attributes.f40570a) == null || (remoteDocumentFile = (DocumentFileData.RemoteDocumentFile) AbstractC17680n.m19341Q(list)) == null) ? null : new C20338h(null, remoteDocumentFile.f40572b, remoteDocumentFile.f40571a, documentFileData.f40568a);
                        if (c20338h != null) {
                            arrayList.add(c20338h);
                        }
                    }
                } else {
                    arrayList = C17689w.f56480Y;
                }
                C21003x c21003x = new C21003x(arrayList);
                this.f40607o0 = interfaceC2186j;
                this.f40605Y = (NetworkCallResult.Success) networkCallResult;
                this.f40606Z = 2;
                if (interfaceC2186j.mo395a(c21003x, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C21002w c21002w2 = new C21002w(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body to be non-null", false, null, 8, null));
                this.f40607o0 = interfaceC2186j;
                this.f40605Y = (NetworkCallResult.Success) networkCallResult;
                this.f40606Z = 3;
                if (interfaceC2186j.mo395a(c21002w2, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            interfaceC2186j2 = interfaceC2186j;
            networkCallResult2 = networkCallResult;
            networkCallResult = networkCallResult2;
            interfaceC2186j = interfaceC2186j2;
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                c21002w = new C21002w(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                this.f40607o0 = networkCallResult;
                this.f40605Y = null;
                this.f40606Z = 4;
                if (interfaceC2186j.mo395a(c21002w, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (networkCallResult instanceof NetworkCallResult.Failure) {
            c21002w = new C21002w(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
            this.f40607o0 = networkCallResult;
            this.f40605Y = null;
            this.f40606Z = 4;
            if (interfaceC2186j.mo395a(c21002w, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
