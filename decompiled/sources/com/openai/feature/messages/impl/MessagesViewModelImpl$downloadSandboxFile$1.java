package com.openai.feature.messages.impl;

import android.net.Uri;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p480Te.C7395t;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.MessagesViewModelImpl", m20656f = "MessagesViewModelImpl.kt", m20657l = {423, HttpStatusCode.UNPROCESSABLE_ENTITY_422}, m20658m = "downloadSandboxFile-ByG7vgg")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MessagesViewModelImpl$downloadSandboxFile$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public MessagesViewModelImpl f38513Y;

    /* JADX INFO: renamed from: Z */
    public String f38514Z;

    /* JADX INFO: renamed from: o0 */
    public Uri f38515o0;

    /* JADX INFO: renamed from: p0 */
    public C7395t f38516p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f38517q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ MessagesViewModelImpl f38518r0;

    /* JADX INFO: renamed from: s0 */
    public int f38519s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$downloadSandboxFile$1(MessagesViewModelImpl messagesViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38518r0 = messagesViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38517q0 = obj;
        this.f38519s0 |= Integer.MIN_VALUE;
        return this.f38518r0.m14301u(null, null, this);
    }
}
