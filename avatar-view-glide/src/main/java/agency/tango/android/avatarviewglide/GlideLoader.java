package agency.tango.android.avatarviewglide;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;

import agency.tango.android.avatarview.AvatarPlaceholder;
import agency.tango.android.avatarview.ImageLoaderBase;
import agency.tango.android.avatarview.views.AvatarView;


public class GlideLoader extends ImageLoaderBase {

    public GlideLoader() {
        super();
    }

    public GlideLoader(String defaultPlaceholderString) {
        super(defaultPlaceholderString);
    }

    @Override
    public void loadImage(@NonNull AvatarView avatarView, @NonNull AvatarPlaceholder avatarPlaceholder, @NonNull String avatarUrl) {
        Glide.with(avatarView.getContext())
                .load(avatarUrl)
//                .crossFade()
                .placeholder(avatarPlaceholder)
                .fitCenter()
                .into(avatarView);
    }

}
