package com.withpersona.sdk2.inquiry.network.dto.styling;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import fk.EnumC13687h;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p523V9.AbstractC8040Z5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0006"}, m18067d2 = {"getBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", DiagnosticsEntry.NAME_KEY, "", "network_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StepStylesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable getBackgroundDrawable(Context context, String str) {
        Integer numM8410f;
        if (str == null || (numM8410f = AbstractC8040Z5.m8410f(context, str, EnumC13687h.f43183Z)) == null) {
            return null;
        }
        return context.getDrawable(numM8410f.intValue());
    }
}
