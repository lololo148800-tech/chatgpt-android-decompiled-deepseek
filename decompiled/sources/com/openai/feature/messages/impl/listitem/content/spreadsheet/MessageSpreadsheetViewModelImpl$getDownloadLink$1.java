package com.openai.feature.messages.impl.listitem.content.spreadsheet;

import com.statsig.androidsdk.StatsigLoggerKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.spreadsheet.MessageSpreadsheetViewModelImpl", m20656f = "MessageSpreadsheetViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "getDownloadLink-lsS2i1g")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessageSpreadsheetViewModelImpl$getDownloadLink$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public MessageSpreadsheetViewModelImpl f38856Y;

    /* JADX INFO: renamed from: Z */
    public String f38857Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f38858o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ MessageSpreadsheetViewModelImpl f38859p0;

    /* JADX INFO: renamed from: q0 */
    public int f38860q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageSpreadsheetViewModelImpl$getDownloadLink$1(MessageSpreadsheetViewModelImpl messageSpreadsheetViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38859p0 = messageSpreadsheetViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38858o0 = obj;
        this.f38860q0 |= Integer.MIN_VALUE;
        return this.f38859p0.mo14318n(null, this);
    }
}
