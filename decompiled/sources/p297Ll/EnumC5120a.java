package p297Ll;

import p523V9.AbstractC7877E4;
import p793ho.EnumC14632O1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v4 Ll.a[], still in use, count: 1, list:
  (r5v4 Ll.a[]) from 0x00d4: INVOKE (r5v4 Ll.a[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:213)
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
/* JADX INFO: renamed from: Ll.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5120a {
    FREEZE_COUNT(EnumC14632O1.CLIENT_VIDEO_SUBSCRIBER_FREEZE_COUNT, "freezeCount"),
    TOTAL_FREEZES_DURATION(EnumC14632O1.CLIENT_VIDEO_SUBSCRIBER_TOTAL_FREEZE_DURATION, "totalFreezesDuration"),
    PAUSE_COUNT(EnumC14632O1.CLIENT_VIDEO_SUBSCRIBER_PAUSE_COUNT, "pauseCount"),
    TOTAL_PAUSES_DURATION(EnumC14632O1.CLIENT_VIDEO_SUBSCRIBER_TOTAL_PAUSES_DURATION, "totalPausesDuration"),
    CONCEALED_SAMPLES(EnumC14632O1.CLIENT_AUDIO_SUBSCRIBER_CONCEALED_SAMPLES, "concealedSamples"),
    SILENT_CONCEALED_SAMPLES(EnumC14632O1.CLIENT_AUDIO_SUBSCRIBER_SILENT_CONCEALED_SAMPLES, "silentConcealedSamples"),
    CONCEALMENT_EVENTS(EnumC14632O1.CLIENT_AUDIO_SUBSCRIBER_CONCEALMENT_EVENTS, "concealmentEvents"),
    JITTER_BUFFER_DELAY(EnumC14632O1.CLIENT_SUBSCRIBER_JITTER_BUFFER_DELAY, "jitterBufferDelay"),
    JITTER_BUFFER_EMITTED_COUNT(EnumC14632O1.CLIENT_SUBSCRIBER_JITTER_BUFFER_EMITTED_COUNT, "jitterBufferEmittedCount"),
    QUALITY_LIMITATION_DURATION_BANDWIDTH(EnumC14632O1.CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_BANDWIDTH, "qualityLimitationDurations"),
    QUALITY_LIMITATION_DURATION_CPU(EnumC14632O1.CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_CPU, "qualityLimitationDurations"),
    QUALITY_LIMITATION_DURATION_OTHER(EnumC14632O1.CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_OTHER, "qualityLimitationDurations");


    /* JADX INFO: renamed from: Y */
    public final EnumC14632O1 f16740Y;

    /* JADX INFO: renamed from: Z */
    public final String f16741Z;

    static {
        AbstractC7877E4.m8156j(enumC5120aArr);
    }

    public EnumC5120a(EnumC14632O1 enumC14632O1, String str) {
        super(str, i);
        this.f16740Y = enumC14632O1;
        this.f16741Z = str;
    }

    public static EnumC5120a valueOf(String str) {
        return (EnumC5120a) Enum.valueOf(EnumC5120a.class, str);
    }

    public static EnumC5120a[] values() {
        return (EnumC5120a[]) f16727A0.clone();
    }
}
