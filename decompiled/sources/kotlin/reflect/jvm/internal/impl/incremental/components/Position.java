package kotlin.reflect.jvm.internal.impl.incremental.components;

import com.google.protobuf.AbstractC12107L1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class Position implements Serializable {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: o0 */
    public static final Position f51712o0 = new Position(-1, -1);

    /* JADX INFO: renamed from: Y */
    public final int f51713Y;

    /* JADX INFO: renamed from: Z */
    public final int f51714Z;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Position getNO_POSITION() {
            return Position.f51712o0;
        }
    }

    public Position(int i10, int i11) {
        this.f51713Y = i10;
        this.f51714Z = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.f51713Y == position.f51713Y && this.f51714Z == position.f51714Z;
    }

    public int hashCode() {
        return (this.f51713Y * 31) + this.f51714Z;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Position(line=");
        sb2.append(this.f51713Y);
        sb2.append(", column=");
        return AbstractC12107L1.m13826q(sb2, this.f51714Z, ')');
    }
}
