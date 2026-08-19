package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p247Jj.C4387I;
import p247Jj.EnumC4458u;
import p342Nj.C5813g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C12865c extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40773Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12869g f40774Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5813g f40775o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12865c(C12869g c12869g, C5813g c5813g, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40774Z = c12869g;
        this.f40775o0 = c5813g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C12865c(this.f40774Z, this.f40775o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C12865c) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40773Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            FallbackModeService fallbackModeService = this.f40774Z.f40787a;
            C5813g c5813g = this.f40775o0;
            String str2 = c5813g.f18968a;
            EnumC4458u enumC4458u = c5813g.f18971d;
            AbstractC16544l.m18094g(enumC4458u, "<this>");
            int iOrdinal = enumC4458u.ordinal();
            if (iOrdinal == 0) {
                str = "production";
            } else {
                if (iOrdinal != 1) {
                    throw new C0644w();
                }
                str = "sandbox";
            }
            String str3 = str;
            Map map = c5813g.f18976i;
            FallbackModeService.SessionIdRequest sessionIdRequest = new FallbackModeService.SessionIdRequest(str2, c5813g.f18969b, c5813g.f18970c, c5813g.f18974g, c5813g.f18973f, str3, c5813g.f18972e, map != null ? new C4387I(map) : null, c5813g.f18977j);
            this.f40773Y = 1;
            obj = fallbackModeService.m14538c(sessionIdRequest, this);
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
