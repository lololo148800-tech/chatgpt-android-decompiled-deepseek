package io.sentry.android.replay;

import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.protocol.C15447t;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: io.sentry.android.replay.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C15291g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47763Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15294h f47764Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15291g(C15294h c15294h, int i10) {
        super(0);
        this.f47763Y = i10;
        this.f47764Z = c15294h;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws IOException {
        switch (this.f47763Y) {
            case 0:
                C15294h c15294h = this.f47764Z;
                if (c15294h.m16518k() == null) {
                    return null;
                }
                File file = new File(c15294h.m16518k(), ".ongoing_segment");
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            default:
                C15294h c15294h2 = this.f47764Z;
                C15524y1 options = c15294h2.f47772Y;
                AbstractC16544l.m18094g(options, "options");
                C15447t replayId = c15294h2.f47773Z;
                AbstractC16544l.m18094g(replayId, "replayId");
                String cacheDirPath = options.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    options.getLogger().mo16298o(EnumC15375i1.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = options.getCacheDirPath();
                AbstractC16544l.m18091d(cacheDirPath2);
                File file2 = new File(cacheDirPath2, "replay_" + replayId);
                file2.mkdirs();
                return file2;
        }
    }
}
