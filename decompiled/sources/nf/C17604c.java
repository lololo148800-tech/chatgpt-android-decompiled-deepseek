package nf;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2052a;

/* JADX INFO: renamed from: nf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17604c implements InterfaceC2052a {

    /* JADX INFO: renamed from: a */
    public final String f56357a;

    public C17604c(String str) {
        this.f56357a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17604c) && AbstractC16544l.m18089b(this.f56357a, ((C17604c) obj).f56357a);
    }

    public final int hashCode() {
        return this.f56357a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
