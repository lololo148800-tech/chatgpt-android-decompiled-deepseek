package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.O1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14632O1 implements InterfaceC12151f0 {
    /* JADX INFO: Fake field, exist only in values array */
    AGENTS_LLM_TTFT(0),
    /* JADX INFO: Fake field, exist only in values array */
    AGENTS_STT_TTFT(1),
    /* JADX INFO: Fake field, exist only in values array */
    AGENTS_TTS_TTFB(2),
    CLIENT_VIDEO_SUBSCRIBER_FREEZE_COUNT(3),
    CLIENT_VIDEO_SUBSCRIBER_TOTAL_FREEZE_DURATION(4),
    CLIENT_VIDEO_SUBSCRIBER_PAUSE_COUNT(5),
    CLIENT_VIDEO_SUBSCRIBER_TOTAL_PAUSES_DURATION(6),
    CLIENT_AUDIO_SUBSCRIBER_CONCEALED_SAMPLES(7),
    CLIENT_AUDIO_SUBSCRIBER_SILENT_CONCEALED_SAMPLES(8),
    CLIENT_AUDIO_SUBSCRIBER_CONCEALMENT_EVENTS(9),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_AUDIO_SUBSCRIBER_INTERRUPTION_COUNT(10),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_AUDIO_SUBSCRIBER_TOTAL_INTERRUPTION_DURATION(11),
    CLIENT_SUBSCRIBER_JITTER_BUFFER_DELAY(12),
    CLIENT_SUBSCRIBER_JITTER_BUFFER_EMITTED_COUNT(13),
    CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_BANDWIDTH(14),
    CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_CPU(15),
    CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_OTHER(16),
    METRIC_LABEL_PREDEFINED_MAX_VALUE(4096),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f45941Y;

    EnumC14632O1(int i10) {
        this.f45941Y = i10;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45941Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
