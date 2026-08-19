package pf;

import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;

/* JADX INFO: renamed from: pf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C18390f implements InterfaceC18393i {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f58670a;

    /* JADX INFO: renamed from: b */
    public final String f58671b;

    public C18390f(C7351f0 message, String fileId) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(fileId, "fileId");
        this.f58670a = message;
        this.f58671b = fileId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18390f)) {
            return false;
        }
        C18390f c18390f = (C18390f) obj;
        return AbstractC16544l.m18089b(this.f58670a, c18390f.f58670a) && AbstractC16544l.m18089b(this.f58671b, c18390f.f58671b);
    }

    public final int hashCode() {
        return this.f58671b.hashCode() + (this.f58670a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
