package p154Fo;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: Fo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2947b {

    /* JADX INFO: renamed from: a */
    public final List f8819a;

    /* JADX INFO: renamed from: b */
    public final Map f8820b;

    /* JADX INFO: renamed from: c */
    public final Object f8821c;

    public C2947b(List operationData, Map mappingOperation, Object obj) {
        AbstractC16544l.m18094g(operationData, "operationData");
        AbstractC16544l.m18094g(mappingOperation, "mappingOperation");
        this.f8819a = operationData;
        this.f8820b = mappingOperation;
        this.f8821c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2947b)) {
            return false;
        }
        C2947b c2947b = (C2947b) obj;
        return AbstractC16544l.m18089b(this.f8819a, c2947b.f8819a) && AbstractC16544l.m18089b(this.f8820b, c2947b.f8820b) && AbstractC16544l.m18089b(this.f8821c, c2947b.f8821c);
    }

    public final int hashCode() {
        int iM21250u = AbstractC20734X.m21250u(this.f8819a.hashCode() * 31, 31, this.f8820b);
        Object obj = this.f8821c;
        return iM21250u + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "OccurrenceCheckInputData(operationData=" + this.f8819a + ", mappingOperation=" + this.f8820b + ", operationDefault=" + this.f8821c + Separators.RPAREN;
    }
}
