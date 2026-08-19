package mo;

import java.util.regex.Pattern;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p026Ao.InterfaceC0677k;
import p571X9.AbstractC9282f0;

/* JADX INFO: renamed from: mo.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C17328E extends AbstractC17329F {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f55187Y;

    /* JADX INFO: renamed from: Z */
    public final long f55188Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f55189o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC0677k f55190p0;

    public /* synthetic */ C17328E(Object obj, long j10, InterfaceC0677k interfaceC0677k, int i10) {
        this.f55187Y = i10;
        this.f55189o0 = obj;
        this.f55188Z = j10;
        this.f55190p0 = interfaceC0677k;
    }

    @Override // mo.AbstractC17329F
    /* JADX INFO: renamed from: O0 */
    public final InterfaceC0677k mo18988O0() {
        switch (this.f55187Y) {
            case 0:
                return (C0675i) this.f55190p0;
            default:
                return (C0657F) this.f55190p0;
        }
    }

    @Override // mo.AbstractC17329F
    /* JADX INFO: renamed from: a */
    public final long mo18989a() {
        switch (this.f55187Y) {
            case 0:
                break;
        }
        return this.f55188Z;
    }

    @Override // mo.AbstractC17329F
    /* JADX INFO: renamed from: e */
    public final C17352s mo18990e() {
        Object obj = this.f55189o0;
        switch (this.f55187Y) {
            case 0:
                return (C17352s) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = C17352s.f55296e;
                return AbstractC9282f0.m9858d(str);
        }
    }
}
