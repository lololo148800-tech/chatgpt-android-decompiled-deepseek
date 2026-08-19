package com.segment.analytics.kotlin.core;

import ao.AbstractC11137K;
import bo.AbstractC11523k;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;

/* JADX INFO: renamed from: com.segment.analytics.kotlin.core.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C12775b extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public static final C12775b f40514d = new C12775b(AbstractC16526C.f51263a.mo5693b(AbstractC12774a.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: c */
    public final KSerializer mo1967c(AbstractC16643b element) throws Exception {
        AbstractC16544l.m18094g(element, "element");
        AbstractC16643b abstractC16643b = (AbstractC16643b) AbstractC11523k.m12917j(element).get("type");
        String strMo12922f = abstractC16643b != null ? AbstractC11523k.m12918k(abstractC16643b).mo12922f() : null;
        if (strMo12922f != null) {
            switch (strMo12922f.hashCode()) {
                case -907689876:
                    if (strMo12922f.equals("screen")) {
                        return ScreenEvent.INSTANCE.serializer();
                    }
                    break;
                case -135762164:
                    if (strMo12922f.equals("identify")) {
                        return IdentifyEvent.INSTANCE.serializer();
                    }
                    break;
                case 92902992:
                    if (strMo12922f.equals("alias")) {
                        return AliasEvent.INSTANCE.serializer();
                    }
                    break;
                case 98629247:
                    if (strMo12922f.equals("group")) {
                        return GroupEvent.INSTANCE.serializer();
                    }
                    break;
                case 110621003:
                    if (strMo12922f.equals("track")) {
                        return TrackEvent.INSTANCE.serializer();
                    }
                    break;
            }
        }
        throw new Exception("Unknown Event: key 'type' not found or does not matches any event type");
    }
}
