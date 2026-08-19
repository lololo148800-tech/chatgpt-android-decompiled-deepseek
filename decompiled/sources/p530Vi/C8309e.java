package p530Vi;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.C16644c;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1114xp.C21346q;
import p225Im.InterfaceC3756d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vi.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C8309e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f25890Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8312h f25891Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f25892o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16644c f25893p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8309e(C8312h c8312h, String str, C16644c c16644c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f25891Z = c8312h;
        this.f25892o0 = str;
        this.f25893p0 = c16644c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8309e(this.f25891Z, this.f25892o0, this.f25893p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8309e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f25890Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21346q c21346q = (C21346q) this.f25891Z.f25903Z.f7436Z;
            String userId = this.f25892o0;
            AbstractC16544l.m18094g(userId, "userId");
            C16644c c16644c = this.f25893p0;
            C8303K c8303k = new C8303K();
            c8303k.f25876a = userId;
            c8303k.f25877b = c16644c;
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8304L.class);
            this.f25890Y = 1;
            if (c21346q.m21740b(c8303k, interfaceC3756dMo5693b, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
