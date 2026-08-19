package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import mm.C17296C;
import mo.AbstractC17325B;
import mo.C17352s;
import p049Bm.InterfaceC1436k;
import p320Mj.EnumC5458k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C12867e extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40779Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12869g f40780Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f40781o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC17325B f40782p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12867e(C12869g c12869g, String str, AbstractC17325B abstractC17325B, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40780Z = c12869g;
        this.f40781o0 = str;
        this.f40782p0 = abstractC17325B;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C12867e(this.f40780Z, this.f40781o0, this.f40782p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C12867e) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40779Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C12869g c12869g = this.f40780Z;
            FallbackModeService fallbackModeService = c12869g.f40787a;
            EnumC5458k enumC5458k = EnumC5458k.f17821Y;
            int i11 = c12869g.f40789c + 1;
            c12869g.f40789c = i11;
            AbstractC17325B abstractC17325B = this.f40782p0;
            long jMo4142a = abstractC17325B.mo4142a();
            C17352s c17352sMo4143b = abstractC17325B.mo4143b();
            if (c17352sMo4143b == null || (str = c17352sMo4143b.f55298a) == null) {
                str = "application/json";
            }
            FallbackModeService.UploadUrlRequest uploadUrlRequest = new FallbackModeService.UploadUrlRequest(jMo4142a, str);
            this.f40779Y = 1;
            obj = fallbackModeService.m14539d(this.f40781o0, enumC5458k, i11, uploadUrlRequest, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
