package p706df;

import bf.InterfaceC11374b0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.InterfaceC21925I1;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: df.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C13104x implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11374b0 f41613a;

    /* JADX INFO: renamed from: b */
    public final List f41614b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21925I1 f41615c;

    /* JADX INFO: renamed from: d */
    public final boolean f41616d;

    /* JADX INFO: renamed from: e */
    public final String f41617e;

    /* JADX INFO: renamed from: f */
    public final Set f41618f;

    /* JADX INFO: renamed from: g */
    public final boolean f41619g;

    public C13104x(InterfaceC11374b0 interfaceC11374b0, List gizmoConversations, InterfaceC21925I1 nextCursor, boolean z6, String str, Set inProgressEdit, boolean z10) {
        AbstractC16544l.m18094g(gizmoConversations, "gizmoConversations");
        AbstractC16544l.m18094g(nextCursor, "nextCursor");
        AbstractC16544l.m18094g(inProgressEdit, "inProgressEdit");
        this.f41613a = interfaceC11374b0;
        this.f41614b = gizmoConversations;
        this.f41615c = nextCursor;
        this.f41616d = z6;
        this.f41617e = str;
        this.f41618f = inProgressEdit;
        this.f41619g = z10;
    }

    /* JADX INFO: renamed from: e */
    public static C13104x m14805e(C13104x c13104x, InterfaceC11374b0 interfaceC11374b0, List list, InterfaceC21925I1 interfaceC21925I1, boolean z6, LinkedHashSet linkedHashSet, int i10) {
        if ((i10 & 1) != 0) {
            interfaceC11374b0 = c13104x.f41613a;
        }
        InterfaceC11374b0 interfaceC11374b1 = interfaceC11374b0;
        if ((i10 & 2) != 0) {
            list = c13104x.f41614b;
        }
        List gizmoConversations = list;
        if ((i10 & 4) != 0) {
            interfaceC21925I1 = c13104x.f41615c;
        }
        InterfaceC21925I1 nextCursor = interfaceC21925I1;
        if ((i10 & 8) != 0) {
            z6 = c13104x.f41616d;
        }
        boolean z10 = z6;
        String str = c13104x.f41617e;
        Set set = linkedHashSet;
        if ((i10 & 32) != 0) {
            set = c13104x.f41618f;
        }
        Set inProgressEdit = set;
        boolean z11 = c13104x.f41619g;
        c13104x.getClass();
        AbstractC16544l.m18094g(gizmoConversations, "gizmoConversations");
        AbstractC16544l.m18094g(nextCursor, "nextCursor");
        AbstractC16544l.m18094g(inProgressEdit, "inProgressEdit");
        return new C13104x(interfaceC11374b1, gizmoConversations, nextCursor, z10, str, inProgressEdit, z11);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13104x)) {
            return false;
        }
        C13104x c13104x = (C13104x) obj;
        if (!AbstractC16544l.m18089b(this.f41613a, c13104x.f41613a) || !AbstractC16544l.m18089b(this.f41614b, c13104x.f41614b) || !AbstractC16544l.m18089b(this.f41615c, c13104x.f41615c) || this.f41616d != c13104x.f41616d) {
            return false;
        }
        String str = this.f41617e;
        String str2 = c13104x.f41617e;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f41618f, c13104x.f41618f) && this.f41619g == c13104x.f41619g;
    }

    public final int hashCode() {
        InterfaceC11374b0 interfaceC11374b0 = this.f41613a;
        int iHashCode = (((this.f41615c.hashCode() + AbstractC14376f.m15858x(this.f41614b, (interfaceC11374b0 == null ? 0 : interfaceC11374b0.hashCode()) * 31, 31)) * 31) + (this.f41616d ? 1231 : 1237)) * 31;
        String str = this.f41617e;
        return ((this.f41618f.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31) + (this.f41619g ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
