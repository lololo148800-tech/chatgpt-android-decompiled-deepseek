package com.openai.feature.onboarding.impl.viewmodel;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003"}, m18067d2 = {"<anonymous>", "Landroid/content/Intent;", "Lcom/openai/platform/uri/AndroidIntent;", "invoke"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VerifyEmailLinkViewModel$Companion$emailIntent$2 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public static final VerifyEmailLinkViewModel$Companion$emailIntent$2 f39291Y = new VerifyEmailLinkViewModel$Companion$emailIntent$2();

    public VerifyEmailLinkViewModel$Companion$emailIntent$2() {
        super(0);
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        intent.addFlags(268435456);
        return intent;
    }
}
