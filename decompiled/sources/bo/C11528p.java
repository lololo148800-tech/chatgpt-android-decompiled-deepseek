package bo;

import co.AbstractC11809J;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC16645d;

/* JADX INFO: renamed from: bo.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C11528p extends AbstractC16645d {

    /* JADX INFO: renamed from: Y */
    public final boolean f34890Y;

    /* JADX INFO: renamed from: Z */
    public final SerialDescriptor f34891Z;

    /* JADX INFO: renamed from: o0 */
    public final String f34892o0;

    public C11528p(Serializable body, boolean z6, SerialDescriptor serialDescriptor) {
        AbstractC16544l.m18094g(body, "body");
        this.f34890Y = z6;
        this.f34891Z = serialDescriptor;
        this.f34892o0 = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11528p.class != obj.getClass()) {
            return false;
        }
        C11528p c11528p = (C11528p) obj;
        return this.f34890Y == c11528p.f34890Y && AbstractC16544l.m18089b(this.f34892o0, c11528p.f34892o0);
    }

    @Override // kotlinx.serialization.json.AbstractC16645d
    /* JADX INFO: renamed from: f */
    public final String mo12922f() {
        return this.f34892o0;
    }

    public final int hashCode() {
        return this.f34892o0.hashCode() + ((this.f34890Y ? 1231 : 1237) * 31);
    }

    @Override // kotlinx.serialization.json.AbstractC16645d
    /* JADX INFO: renamed from: j */
    public final boolean mo12923j() {
        return this.f34890Y;
    }

    @Override // kotlinx.serialization.json.AbstractC16645d
    public final String toString() {
        boolean z6 = this.f34890Y;
        String str = this.f34892o0;
        if (!z6) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        AbstractC11809J.m13071a(str, sb2);
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
