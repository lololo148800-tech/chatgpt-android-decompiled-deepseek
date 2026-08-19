package p1140z1;

import p482Tg.C7445b0;
import p523V9.AbstractC8111i5;
import p737f1.InterfaceC13517i;

/* JADX INFO: renamed from: z1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C21692g implements InterfaceC13517i {

    /* JADX INFO: renamed from: a */
    public static final C21692g f68855a = new C21692g();

    /* JADX INFO: renamed from: b */
    public static Boolean f68856b;

    @Override // p737f1.InterfaceC13517i
    /* JADX INFO: renamed from: a */
    public final boolean mo15068a() {
        Boolean bool = f68856b;
        if (bool != null) {
            return bool.booleanValue();
        }
        AbstractC8111i5.m8593d("canFocus is read before it is written");
        throw null;
    }

    @Override // p737f1.InterfaceC13517i
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo15069b(C7445b0 c7445b0) {
    }

    @Override // p737f1.InterfaceC13517i
    /* JADX INFO: renamed from: c */
    public final void mo15070c(boolean z6) {
        f68856b = Boolean.valueOf(z6);
    }

    @Override // p737f1.InterfaceC13517i
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo15071d(C7445b0 c7445b0) {
    }
}
