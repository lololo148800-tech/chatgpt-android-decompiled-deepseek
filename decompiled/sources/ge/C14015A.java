package ge;

import kotlin.jvm.internal.AbstractC16544l;
import p990rg.C18982i;

/* JADX INFO: renamed from: ge.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C14015A implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final C18982i f44096a;

    public C14015A(C18982i prompt) {
        AbstractC16544l.m18094g(prompt, "prompt");
        this.f44096a = prompt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14015A) && AbstractC16544l.m18089b(this.f44096a, ((C14015A) obj).f44096a);
    }

    public final int hashCode() {
        return this.f44096a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
