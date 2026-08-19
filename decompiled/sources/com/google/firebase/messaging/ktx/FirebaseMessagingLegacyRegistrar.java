package com.google.firebase.messaging.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p523V9.AbstractC7950N5;
import p571X9.AbstractC9393x3;
import p890mb.C17204a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Lcom/google/firebase/messaging/ktx/FirebaseMessagingLegacyRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lmb/a;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-messaging-ktx"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FirebaseMessagingLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C17204a> getComponents() {
        return AbstractC9393x3.m9974d(AbstractC7950N5.m8239a("fire-fcm-ktx", "24.1.0"));
    }
}
