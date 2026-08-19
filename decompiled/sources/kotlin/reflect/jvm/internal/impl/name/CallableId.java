package kotlin.reflect.jvm.internal.impl.name;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes2.dex */
public final class CallableId {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final FqName f52669a;

    /* JADX INFO: renamed from: b */
    public final Name f52670b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        FqName.Companion.topLevel(SpecialNames.LOCAL);
    }

    public CallableId(FqName packageName, Name callableName) {
        AbstractC16544l.m18094g(packageName, "packageName");
        AbstractC16544l.m18094g(callableName, "callableName");
        this.f52669a = packageName;
        this.f52670b = callableName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallableId) {
            CallableId callableId = (CallableId) obj;
            if (AbstractC16544l.m18089b(this.f52669a, callableId.f52669a) && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(this.f52670b, callableId.f52670b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f52670b.hashCode() + ((this.f52669a.hashCode() + 527) * 961);
    }

    public String toString() {
        return AbstractC21329w.m21730q(this.f52669a.asString(), '.', '/') + Separators.SLASH + this.f52670b;
    }
}
