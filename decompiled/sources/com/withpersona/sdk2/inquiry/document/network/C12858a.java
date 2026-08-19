package com.withpersona.sdk2.inquiry.document.network;

import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1027tp.C20048M;
import p103Dn.InterfaceC2186j;
import p1087wj.C20980a;
import p1087wj.C20981b;
import p1087wj.C20983d;
import p1087wj.InterfaceC20971B;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12858a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f40597Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f40598Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20983d f40599o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12858a(C20983d c20983d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f40599o0 = c20983d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C12858a c12858a = new C12858a(this.f40599o0, interfaceC18770c);
        c12858a.f40598Z = obj;
        return c12858a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C12858a) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40597Y;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2186j = (InterfaceC2186j) this.f40598Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC2186j = (InterfaceC2186j) this.f40598Z;
        C20983d c20983d = this.f40599o0;
        InterfaceC20971B interfaceC20971B = c20983d.f66807c;
        String kind = c20983d.f66808d;
        AbstractC16544l.m18094g(kind, "kind");
        String fieldKeyDocument = c20983d.f66810f;
        AbstractC16544l.m18094g(fieldKeyDocument, "fieldKeyDocument");
        CreateDocumentRequest createDocumentRequest = new CreateDocumentRequest(new CreateDocumentRequest.Data("document", new CreateDocumentRequest.Attributes(kind, c20983d.f66809e)), new CreateDocumentRequest.Meta(fieldKeyDocument));
        this.f40598Z = interfaceC2186j;
        this.f40597Y = 1;
        obj = interfaceC20971B.m21459c(c20983d.f66806b, createDocumentRequest, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C20048M c20048m = (C20048M) obj;
        if (c20048m.f63525a.m18985a()) {
            Object obj2 = c20048m.f63526b;
            AbstractC16544l.m18091d(obj2);
            C20981b c20981b = new C20981b(((CreateDocumentResponse) obj2).f40560a.f40562a);
            this.f40598Z = null;
            this.f40597Y = 2;
            if (interfaceC2186j.mo395a(c20981b, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            C20980a c20980a = new C20980a(NetworkUtilsKt.toErrorInfo(c20048m));
            this.f40598Z = null;
            this.f40597Y = 3;
            if (interfaceC2186j.mo395a(c20980a, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
