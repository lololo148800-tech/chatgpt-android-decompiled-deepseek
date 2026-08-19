package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p523V9.AbstractC7877E4;
import tm.InterfaceC20006a;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = false)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public enum PendingPageTextPosition {
    TOP,
    BOTTOM;

    private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion extends AbstractC11471r {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // bj.AbstractC11471r
        @InterfaceC11453S
        public void toJson(AbstractC11440E writer, PendingPageTextPosition value) {
        }

        private Companion() {
        }

        @Override // bj.AbstractC11471r
        @InterfaceC11467n
        public PendingPageTextPosition fromJson(AbstractC11477x reader) {
            Object objM12871r0 = reader.m12871r0();
            if (AbstractC16544l.m18089b(objM12871r0, "start")) {
                return PendingPageTextPosition.TOP;
            }
            return AbstractC16544l.m18089b(objM12871r0, "end") ? PendingPageTextPosition.BOTTOM : PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
    }

    public static InterfaceC20006a getEntries() {
        return $ENTRIES;
    }
}
