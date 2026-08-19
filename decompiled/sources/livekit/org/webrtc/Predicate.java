package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public interface Predicate<T> {

    /* JADX INFO: renamed from: livekit.org.webrtc.Predicate$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* JADX INFO: renamed from: a */
        public static Predicate m18763a(final Predicate predicate, final Predicate predicate2) {
            return new Predicate() { // from class: livekit.org.webrtc.Predicate.2
                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate3) {
                    return CC.m18763a(this, predicate3);
                }

                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate negate() {
                    return CC.m18764b(this);
                }

                @Override // livekit.org.webrtc.Predicate
                /* JADX INFO: renamed from: or */
                public final /* synthetic */ Predicate mo18731or(Predicate predicate3) {
                    return CC.m18765c(this, predicate3);
                }

                @Override // livekit.org.webrtc.Predicate
                public boolean test(Object obj) {
                    return Predicate.this.test(obj) && predicate2.test(obj);
                }
            };
        }

        /* JADX INFO: renamed from: b */
        public static Predicate m18764b(final Predicate predicate) {
            return new Predicate() { // from class: livekit.org.webrtc.Predicate.3
                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate2) {
                    return CC.m18763a(this, predicate2);
                }

                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate negate() {
                    return CC.m18764b(this);
                }

                @Override // livekit.org.webrtc.Predicate
                /* JADX INFO: renamed from: or */
                public final /* synthetic */ Predicate mo18731or(Predicate predicate2) {
                    return CC.m18765c(this, predicate2);
                }

                @Override // livekit.org.webrtc.Predicate
                public boolean test(Object obj) {
                    return !Predicate.this.test(obj);
                }
            };
        }

        /* JADX INFO: renamed from: c */
        public static Predicate m18765c(final Predicate predicate, final Predicate predicate2) {
            return new Predicate() { // from class: livekit.org.webrtc.Predicate.1
                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate3) {
                    return CC.m18763a(this, predicate3);
                }

                @Override // livekit.org.webrtc.Predicate
                public final /* synthetic */ Predicate negate() {
                    return CC.m18764b(this);
                }

                @Override // livekit.org.webrtc.Predicate
                /* JADX INFO: renamed from: or */
                public final /* synthetic */ Predicate mo18731or(Predicate predicate3) {
                    return CC.m18765c(this, predicate3);
                }

                @Override // livekit.org.webrtc.Predicate
                public boolean test(Object obj) {
                    return Predicate.this.test(obj) || predicate2.test(obj);
                }
            };
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    /* JADX INFO: renamed from: or */
    Predicate<T> mo18731or(Predicate<? super T> predicate);

    boolean test(T t10);
}
