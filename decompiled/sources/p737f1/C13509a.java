package p737f1;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: f1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13509a extends AbstractC10458p implements InterfaceC13511c {

    /* JADX INFO: renamed from: A0 */
    public EnumC13525q f42772A0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC1436k f42773z0;

    @Override // p737f1.InterfaceC13511c
    /* JADX INFO: renamed from: y */
    public final void mo15025y(EnumC13525q enumC13525q) {
        if (AbstractC16544l.m18089b(this.f42772A0, enumC13525q)) {
            return;
        }
        this.f42772A0 = enumC13525q;
        this.f42773z0.invoke(enumC13525q);
    }
}
