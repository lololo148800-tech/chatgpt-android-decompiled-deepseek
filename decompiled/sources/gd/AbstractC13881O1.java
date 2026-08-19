package gd;

import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import p817j$.util.Objects;

/* JADX INFO: renamed from: gd.O1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public abstract class AbstractC13881O1 {
    public static final C13951j0 Companion = new C13951j0();

    /* JADX INFO: renamed from: b */
    public static final Object f43919b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C13947i0.f43999Z);

    /* JADX INFO: renamed from: a */
    public final String f43920a;

    public AbstractC13881O1(String str) {
        this.f43920a = str;
    }

    public final boolean equals(Object obj) {
        AbstractC13881O1 abstractC13881O1 = obj instanceof AbstractC13881O1 ? (AbstractC13881O1) obj : null;
        return Objects.equals(this.f43920a, abstractC13881O1 != null ? abstractC13881O1.f43920a : null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f43920a);
    }
}
