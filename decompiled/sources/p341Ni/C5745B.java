package p341Ni;

import android.app.Application;
import android.content.Context;
import gd.C13854F1;
import gd.C14005w2;
import gd.InterfaceC13849E;
import io.livekit.audio.krisp.KrispAudioProcessor;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.C0205S1;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p328N1.C5586b;
import p523V9.AbstractC8160o6;
import p557Wl.C8949e;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9233X;
import p959q8.C18639a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C5745B extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f18697Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5784h0 f18698Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5745B(C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18698Z = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5745B(this.f18698Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5745B) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f18697Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC13849E interfaceC13849E = this.f18698Z.f18856h;
        C13854F1 c13854f1 = C13854F1.f43891c;
        this.f18697Y = 1;
        obj = ((C14005w2) interfaceC13849E).m15482b(c13854f1, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        if (((Boolean) obj).booleanValue()) {
            AbstractC8160o6.m8726a(this.f18698Z.f18872x, "Initializing Krisp", null, 6);
            C18639a c18639a = KrispAudioProcessor.f46969k;
            Application context = this.f18698Z.f18850b;
            AbstractC16544l.m18094g(context, "context");
            KrispAudioProcessor krispAudioProcessor = KrispAudioProcessor.f46970l;
            if (krispAudioProcessor == null) {
                synchronized (c18639a) {
                    krispAudioProcessor = KrispAudioProcessor.f46970l;
                    if (krispAudioProcessor == null) {
                        Context applicationContext = context.getApplicationContext();
                        AbstractC16544l.m18093f(applicationContext, "context.applicationContext");
                        krispAudioProcessor = new KrispAudioProcessor(new C5586b(applicationContext, 1));
                        KrispAudioProcessor.f46970l = krispAudioProcessor;
                    }
                }
            }
            krispAudioProcessor.m16223c();
            C8949e c8949e = (C8949e) this.f18698Z.f18871w.f15385j;
            c8949e.getClass();
            c8949e.f27359b.m8944g(krispAudioProcessor, C8949e.f27357f[0]);
            AbstractC8160o6.m8726a(this.f18698Z.f18872x, "Initialized Krisp", null, 6);
            InterfaceC2184i interfaceC2184iM9771b = AbstractC9206S2.m9771b(new C5744A(2, null), this.f18698Z.f18865q);
            C0205S1 c0205s1 = new C0205S1(this.f18698Z, 4);
            this.f18697Y = 2;
            if (interfaceC2184iM9771b.mo3141d(c0205s1, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
