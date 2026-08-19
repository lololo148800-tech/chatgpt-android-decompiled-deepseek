package p993rj;

import android.media.MediaRecorder;
import android.os.Build;
import java.io.File;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p670c1.AbstractC11557a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rj.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C19037Q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19038S f60685Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19037Q(C19038S c19038s, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60685Y = c19038s;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19037Q(this.f60685Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19037Q) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        File file;
        C19038S c19038s = this.f60685Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        try {
            c19038s.f60693h.stop();
            file = c19038s.f60692g;
        } catch (RuntimeException unused) {
            c19038s.f60692g.delete();
            file = null;
        }
        c19038s.f60693h.release();
        c19038s.f60693h = Build.VERSION.SDK_INT >= 31 ? AbstractC11557a.m12938c(c19038s.f60686a) : new MediaRecorder();
        c19038s.m20296c(false);
        return file;
    }
}
