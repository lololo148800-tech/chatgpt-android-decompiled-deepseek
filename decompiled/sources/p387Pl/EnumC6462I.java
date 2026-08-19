package p387Pl;

import livekit.org.webrtc.MediaStreamTrack;
import p025An.C0644w;
import p523V9.AbstractC7877E4;
import p793ho.EnumC14692Y2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 Pl.I[], still in use, count: 1, list:
  (r4v3 Pl.I[]) from 0x002f: INVOKE (r4v3 Pl.I[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:48)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: Pl.I */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6462I {
    AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND),
    UNRECOGNIZED("unrecognized");

    public static final C6461H Companion;

    /* JADX INFO: renamed from: Y */
    public final String f20968Y;

    static {
        AbstractC7877E4.m8156j(enumC6462IArr);
        Companion = new C6461H();
    }

    public EnumC6462I(String str) {
        super(str, i);
        this.f20968Y = str;
    }

    public static EnumC6462I valueOf(String str) {
        return (EnumC6462I) Enum.valueOf(EnumC6462I.class, str);
    }

    public static EnumC6462I[] values() {
        return (EnumC6462I[]) f20967q0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC14692Y2 m7048a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return EnumC14692Y2.AUDIO;
        }
        if (iOrdinal == 1) {
            return EnumC14692Y2.VIDEO;
        }
        if (iOrdinal == 2) {
            return EnumC14692Y2.UNRECOGNIZED;
        }
        throw new C0644w();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20968Y;
    }
}
