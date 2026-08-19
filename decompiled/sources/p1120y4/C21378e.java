package p1120y4;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: y4.e */
/* JADX INFO: loaded from: classes.dex */
public class C21378e extends C21377d {

    /* JADX INFO: renamed from: e */
    public long f67869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21378e(ArrayList states) {
        super(states);
        AbstractC16544l.m18094g(states, "states");
        this.f67869e = 0L;
    }

    @Override // p1120y4.C21377d
    public boolean equals(Object obj) {
        return (obj instanceof C21378e) && super.equals(obj) && this.f67869e == ((C21378e) obj).f67869e;
    }

    @Override // p1120y4.C21377d
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        long j10 = this.f67869e;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // p1120y4.C21377d
    public String toString() {
        return "FrameData(frameStartNanos=" + this.f67866b + ", frameDurationUiNanos=" + this.f67867c + ", frameDurationCpuNanos=" + this.f67869e + ", isJank=" + this.f67868d + ", states=" + this.f67865a + ')';
    }
}
