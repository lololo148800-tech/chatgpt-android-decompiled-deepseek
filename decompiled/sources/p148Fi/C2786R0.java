package p148Fi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p172Gi.C3075h;
import p324Mn.C5551u;
import p387Pl.EnumC6481b;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.R0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2786R0 {
    public static final C2785Q0 Companion = new C2785Q0();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f8501f = {new C11158d(C3075h.f9277a, 0), null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final List f8502a;

    /* JADX INFO: renamed from: b */
    public final String f8503b;

    /* JADX INFO: renamed from: c */
    public final EnumC6481b f8504c;

    /* JADX INFO: renamed from: d */
    public final C5551u f8505d;

    /* JADX INFO: renamed from: e */
    public final C5551u f8506e;

    public C2786R0(List voices, String selected, EnumC6481b cameraPosition, C5551u lastUpdated, C5551u lastVideoWarningShown) {
        AbstractC16544l.m18094g(voices, "voices");
        AbstractC16544l.m18094g(selected, "selected");
        AbstractC16544l.m18094g(cameraPosition, "cameraPosition");
        AbstractC16544l.m18094g(lastUpdated, "lastUpdated");
        AbstractC16544l.m18094g(lastVideoWarningShown, "lastVideoWarningShown");
        this.f8502a = voices;
        this.f8503b = selected;
        this.f8504c = cameraPosition;
        this.f8505d = lastUpdated;
        this.f8506e = lastVideoWarningShown;
    }

    /* JADX INFO: renamed from: a */
    public static C2786R0 m3709a(C2786R0 c2786r0, List list, String str, EnumC6481b enumC6481b, C5551u c5551u, int i10) {
        if ((i10 & 1) != 0) {
            list = c2786r0.f8502a;
        }
        List voices = list;
        if ((i10 & 2) != 0) {
            str = c2786r0.f8503b;
        }
        String selected = str;
        if ((i10 & 4) != 0) {
            enumC6481b = c2786r0.f8504c;
        }
        EnumC6481b cameraPosition = enumC6481b;
        C5551u lastUpdated = c2786r0.f8505d;
        if ((i10 & 16) != 0) {
            c5551u = c2786r0.f8506e;
        }
        C5551u lastVideoWarningShown = c5551u;
        c2786r0.getClass();
        AbstractC16544l.m18094g(voices, "voices");
        AbstractC16544l.m18094g(selected, "selected");
        AbstractC16544l.m18094g(cameraPosition, "cameraPosition");
        AbstractC16544l.m18094g(lastUpdated, "lastUpdated");
        AbstractC16544l.m18094g(lastVideoWarningShown, "lastVideoWarningShown");
        return new C2786R0(voices, selected, cameraPosition, lastUpdated, lastVideoWarningShown);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2786R0)) {
            return false;
        }
        C2786R0 c2786r0 = (C2786R0) obj;
        return AbstractC16544l.m18089b(this.f8502a, c2786r0.f8502a) && AbstractC16544l.m18089b(this.f8503b, c2786r0.f8503b) && this.f8504c == c2786r0.f8504c && AbstractC16544l.m18089b(this.f8505d, c2786r0.f8505d) && AbstractC16544l.m18089b(this.f8506e, c2786r0.f8506e);
    }

    public final int hashCode() {
        return this.f8506e.f18004Y.hashCode() + ((this.f8505d.f18004Y.hashCode() + ((this.f8504c.hashCode() + AbstractC0168G.m527p(this.f8502a.hashCode() * 31, 31, this.f8503b)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C2786R0(int i10, List list, String str, EnumC6481b enumC6481b, C5551u c5551u, C5551u c5551u2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C2783P0.f8500a.getDescriptor());
            throw null;
        }
        this.f8502a = list;
        this.f8503b = str;
        if ((i10 & 4) == 0) {
            this.f8504c = EnumC6481b.f21035Z;
        } else {
            this.f8504c = enumC6481b;
        }
        if ((i10 & 8) == 0) {
            C5551u.Companion.getClass();
            this.f8505d = C5551u.f18000Z;
        } else {
            this.f8505d = c5551u;
        }
        if ((i10 & 16) != 0) {
            this.f8506e = c5551u2;
        } else {
            C5551u.Companion.getClass();
            this.f8506e = C5551u.f18000Z;
        }
    }
}
