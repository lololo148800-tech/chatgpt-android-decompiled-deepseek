package p1087wj;

import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1027tp.C20048M;
import p1131yj.InterfaceC21546a;
import p320Mj.C5461n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wj.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C20976G extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f66787Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20978I f66788Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20976G(C20978I c20978i, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f66788Z = c20978i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C20976G(this.f66788Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C20976G) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66787Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
                return (C20048M) obj;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return (C20048M) obj;
        }
        AbstractC9233X.m9807c(obj);
        C20978I c20978i = this.f66788Z;
        InterfaceC21546a interfaceC21546a = c20978i.f66798g;
        boolean z6 = ((C5461n) interfaceC21546a).f17833d != null;
        String fromComponent = c20978i.f66797f;
        String fromStep = c20978i.f66796e;
        String str = c20978i.f66793b;
        if (z6) {
            AbstractC16544l.m18094g(fromStep, "fromStep");
            AbstractC16544l.m18094g(fromComponent, "fromComponent");
            SubmitDocumentRequest submitDocumentRequest = new SubmitDocumentRequest(null, new SubmitDocumentRequest.Meta(fromStep, fromComponent), 1, null);
            this.f66787Y = 1;
            obj = ((C5461n) interfaceC21546a).m5909b(str, submitDocumentRequest, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            return (C20048M) obj;
        }
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        SubmitDocumentRequest submitDocumentRequest2 = new SubmitDocumentRequest(null, new SubmitDocumentRequest.Meta(fromStep, fromComponent), 1, null);
        this.f66787Y = 2;
        obj = c20978i.f66794c.m21458b(str, c20978i.f66795d, submitDocumentRequest2, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        return (C20048M) obj;
    }
}
