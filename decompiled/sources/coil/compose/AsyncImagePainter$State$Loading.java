package coil.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p882m1.AbstractC17140a;
import p886m5.AbstractC17167b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"coil/compose/AsyncImagePainter$State$Loading", "Lm5/b;", "Lm1/a;", "painter", "Lm1/a;", "a", "()Lm1/a;", "coil-compose-base_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class AsyncImagePainter$State$Loading extends AbstractC17167b {
    private final AbstractC17140a painter;

    public AsyncImagePainter$State$Loading(AbstractC17140a abstractC17140a) {
        this.painter = abstractC17140a;
    }

    @Override // p886m5.AbstractC17167b
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17140a getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AsyncImagePainter$State$Loading) && AbstractC16544l.m18089b(this.painter, ((AsyncImagePainter$State$Loading) obj).painter);
    }

    public final int hashCode() {
        AbstractC17140a abstractC17140a = this.painter;
        if (abstractC17140a == null) {
            return 0;
        }
        return abstractC17140a.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.painter + ')';
    }
}
