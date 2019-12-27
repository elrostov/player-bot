package telegramApp.service;

import telegramApp.dto.SongRequest;
import telegramApp.dto.SongResponse;

public interface TelegramApiService {

    SongResponse sendAutorAndSongName(SongRequest telegramMessage);

    void approveSong(SongRequest telegramMessage) ;
}
